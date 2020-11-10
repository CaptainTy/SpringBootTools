package com.tionsy.springbootcomponents.config;

import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.retry.backoff.ExponentialBackOffPolicy;
import org.springframework.retry.support.RetryTemplate;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author tiany
 * @version 1.0
 * @date Created in 2020年11月09日 11:49
 * @since 1.0
 */
@Configuration
public class RabbitMqConfig {
    @Value("${spring.rabbitmq.address}")
    private String mqAddress;
    @Value("${spring.rabbitmq.port}")
    private String mqPort;
    @Value("${spring.rabbitmq.username}")
    private String mqUsername;
    @Value("${spring.rabbitmq.password}")
    private String mqPassword;
    @Value("${spring.rabbitmq.virtual-host}")
    private String virtualHost;

    /**
     * todo confirm
     *
     * @return
     */
    @Bean(value = "connectionFactory")
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory(mqAddress,Integer.parseInt(mqPort));
        connectionFactory.setUsername(mqUsername);
        connectionFactory.setPassword(mqPassword);
        connectionFactory.setVirtualHost(virtualHost);
        //connectionFactory.setPublisherConfirms(true);
        return connectionFactory;
    }

    @Bean(value = "myListenerFactory")
    public SimpleRabbitListenerContainerFactory newClusterListenerFactoryWithManualAck(@Qualifier("jsonMessageConverter")MessageConverter jsonMessageConverter,
                                                                                       @Qualifier("connectionFactory") ConnectionFactory connectionFactory) {
        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);
        factory.setMessageConverter(jsonMessageConverter);
        //自动ack 起始手动ack更好一点，自动的简单点
        factory.setAcknowledgeMode(AcknowledgeMode.AUTO);
        return factory;
    }
    @Bean
    public RetryTemplate retryTemplate() {
        RetryTemplate retryTemplate = new RetryTemplate();
        ExponentialBackOffPolicy backOffPolicy = new ExponentialBackOffPolicy();
        backOffPolicy.setInitialInterval(500);
        backOffPolicy.setMultiplier(10.0);
        backOffPolicy.setMaxInterval(10000);
        retryTemplate.setBackOffPolicy(backOffPolicy);
        return retryTemplate;
    }

    @Bean
    public AmqpTemplate rabbitTemplate(@Qualifier("connectionFactory") ConnectionFactory connectionFactory, RetryTemplate retryTemplate) {
        RabbitTemplate template = new RabbitTemplate(connectionFactory);
        template.setRetryTemplate(retryTemplate);
        template.setMessageConverter(jsonMessageConverter());
        return template;
    }

    @Bean
    public MessageConverter jsonMessageConverter() {
        return new Jackson2JsonMessageConverter();
    }
}
