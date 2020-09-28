/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sample.simple.swagger;

import static com.google.common.base.Predicates.or;
import static com.google.common.collect.Lists.newArrayList;
import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StopWatch;

import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 启动swagger进行API描述自动生成在线文档。
 * 
 * @author aol_aog
 * @version $Id: SwaggerConfiguration.java, v 0.1 2016年4月9日 上午11:07:09 aol_aog Exp $
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

  private final Logger log = LoggerFactory.getLogger(SwaggerConfiguration.class);


  @Bean
  public Docket cmdbDocket() {
    log.debug("测试接口API");
    StopWatch watch = new StopWatch();
    watch.start();

    Parameter parameterAccessToken = new ParameterBuilder().name("access-token").description("Access token identifier")
      .modelRef(new ModelRef("string")).parameterType("header").required(false).build();

    Docket swaggerSpringMvcPlugin =
      new Docket(DocumentationType.SWAGGER_2).groupName("Test_API").apiInfo(testApiInfo()).select().paths(or(regex("/api/hello/.*")))
        .build().securitySchemes(newArrayList(apiKey()));

    swaggerSpringMvcPlugin.globalOperationParameters(Arrays.asList(new Parameter[] {parameterAccessToken}));
    watch.stop();
    log.debug("Started {} Swagger2 in {} ms", "接口API", watch.getTotalTimeMillis());
    return swaggerSpringMvcPlugin;
  }


  private ApiInfo testApiInfo() {
    return new ApiInfo("测试 API接口说明", "Test API Desction", "1.0", "无",
      new Contact("测试", "http://www.hfbank.com.cn", "hf@hfbank.com"), "商业版本", "无", new ArrayList<VendorExtension>());
  }

  private ApiKey apiKey() {
    return new ApiKey("access-token", "access-token", "header");
  }

  List<SecurityReference> defaultAuth() {
    AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
    AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
    authorizationScopes[0] = authorizationScope;
    return newArrayList(new SecurityReference("access-token", authorizationScopes));
  }

}
