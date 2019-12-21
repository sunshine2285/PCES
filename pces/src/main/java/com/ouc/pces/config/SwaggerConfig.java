/*
 * Copyright (c) 2019
 * FileName: SwaggerConfig.java
 * @Author: 孙浩杰
 * @LastModified:2019-10-31 18:14:12
 */

package com.ouc.pces.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.ouc.pces.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "PCES后端Api文档",
                "Public course evaluation system rest 接口api",
                "API V1.0",
                "https://sunhaojie.club",
                new Contact("PCES", "https://github.com/sunshine2285/PCES", "sunshine2285@163.com"),
                "Apache2", "http://www.apache2.org/", Collections.emptyList());
    }
}