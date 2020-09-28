package com.ziroom.mydemo.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Properties;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author tianyun
 * @version 1.0
 * @date Created in 2019年09月08日 11:46
 * @since 1.0
 */
public class CustomConsumer {

    public static void main(String[] args) {
        KafkaConsumer<String,String> consumer = null;
        //1.配置消费者属性
        Properties props = new Properties();
        //d定义kafka的服务地址
        props.put("bootstrap.servers","192.168.202.128:9092");
        //设置消费者组
        props.put("group.id","gs");
        //是否自动确认offset
        props.put("enable.auto.commit","true");
        // key的反序列化
        props.put("key.deserializer","org.apache.kafka.common.serialization.StringDeserializer");
        // value的反序列化
        props.put("value.deserializer","org.apache.kafka.common.serialization.StringDeserializer");
        //2.创建消费者实例
        consumer = new KafkaConsumer<>(props);
        //3.消费模式-订阅模式
        consumer.subscribe(Collections.singletonList("first"));
        //4.拉消息
        while (true) {
            // 读取数据，读取超时时间为100ms
            ConsumerRecords<String, String> records = consumer.poll(100);

            for (ConsumerRecord<String, String> record : records){
                System.out.printf("offset = %d, key = %s, value = %s%n", record.offset(), record.key(), record.value());
            }

        }


    }
}
