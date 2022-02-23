package site.licoded.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import site.licoded.starter.entity.SwaggerConfigEntity;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
* Swagger配置类
*/
@Configuration
@EnableOpenApi
public class SwaggerConfig {
    @Bean
    public Docket docket(){
       return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo()).enable(true)
                .select()
                //apis： 添加swagger接口提取范围
                .apis(RequestHandlerSelectors.basePackage("com.example"))
                //.apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
    }

    @Autowired
    private SwaggerConfigEntity swaggerConfigBean;
    
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title(swaggerConfigBean.getTitle())
                .description(swaggerConfigBean.getDescription())
                .contact(new Contact(
                        swaggerConfigBean.getContact().getName(),
                        swaggerConfigBean.getContact().getUrl(),
                        swaggerConfigBean.getContact().getEmail()
                ))
                .version(swaggerConfigBean.getVersion())
                .build();
    }
}