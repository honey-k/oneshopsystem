package com.chinadci.oneshopreception.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class swaggerconfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.chinadci.oneshopreception.controller"))
                .paths(PathSelectors.any()).build()
                .apiInfo(new ApiInfoBuilder().title("测试demo")
                        .description("详细信息")
                        .version("1.0")
                        .contact(new Contact("大老板", "www.qq.com", "www.123@qq.com"))
                        .license("China dci")
                        .licenseUrl("www.Chinadci.com").build());
    }


}
