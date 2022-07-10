package org.xunjian.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.annotations.Api;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.RequestParameterBuilder;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.RequestParameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author xianghsuai
 * @date 2020/3/4
 */
@Configuration
@EnableOpenApi
//@Profile({"dev", "test"})
public class SwaggerConfig {
    @Bean
    public Docket authApi() {
        RequestParameterBuilder ticketPar = new RequestParameterBuilder();
        List<RequestParameter> pars = new ArrayList<>();
//        ticketPar.name("app_key")
//                .precedence(Ordered.LOWEST_PRECEDENCE)
//                .description("app_key")
//                .in(ParameterType.HEADER)
//                .required(true);
//        pars.add(ticketPar.build());
//
//        ticketPar.name("app_secret")
//                .precedence(Ordered.LOWEST_PRECEDENCE)
//                .description("app_secret")
//                .in(ParameterType.HEADER)
//                .required(true);
//        pars.add(ticketPar.build());

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("security")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .build().globalRequestParameters(pars);

    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .contact(new Contact("Boreas320", "", "xiangshuai320@google.com"))
                .title("管理中心接口文档")
                .description(
                        "管理中心接口文档").build();
    }

}
