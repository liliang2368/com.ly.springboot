package com.yc.projects.yc74ibike.config;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@ComponentScan(basePackages="com.yc")
@EnableSwagger2    //启用swaggerr 注解解析器
public class AppConfig_Swagger {
	// 是否开启swagger，正式环境一般是需要关闭的，可根据springboot的多环境配置进行设置
	@Value(value = "${swagger.enabled}")  //通过 @Value  获取配置信息   复习   @Environement  @Value    @ConfigurationProperties
	Boolean swaggerEnabled;
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.yc"))
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("项目管理系统 RESTful APIs")
                .description("项目管理系统接口（API）使用文档")
                .version("1.0")
                .build();
    }

}
