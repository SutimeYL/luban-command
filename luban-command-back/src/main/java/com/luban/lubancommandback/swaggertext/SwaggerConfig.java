package com.luban.lubancommandback.swaggertext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName SwaggerConfig
 * @Author yuanlei
 * @Date 2018/10/12 9:07
 * @Version 1.0
 **/

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                /*访问系统的地址*/
                .host("")
                .apiInfo(apiInfo())
                .select()
                /*需要写在接口文档的接口*/
                .apis(RequestHandlerSelectors.basePackage("com"))
                .paths(PathSelectors.any())
                .build();
    }


    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("鲁班运营指挥中心系统后台")
                .description("鲁班运营指挥中心系统后台接口文档")
                .version("1.0.0")
                .build();
    }
}
