package site.licoded.starter.bean;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import site.licoded.starter.configProperties.SwaggerConfigProperties;
import site.licoded.starter.entity.SwaggerConfigEntity;

@Configuration
@EnableConfigurationProperties(SwaggerConfigProperties.class)
public class SwaggerConfigBeanAutoConfiguration {
    private final SwaggerConfigProperties swaggerConfigProperties;

    // 通过构造方法获取配置属性对象PersonProperties
    public SwaggerConfigBeanAutoConfiguration(SwaggerConfigProperties swaggerConfigProperties) {
        this.swaggerConfigProperties = swaggerConfigProperties;
    }

    // 实例化PersonEntity为Bean，放入SpringIoc容器
    @Bean
    public SwaggerConfigEntity swaggerConfigBean(){
        return new SwaggerConfigEntity(
                swaggerConfigProperties.getTitle(),
                swaggerConfigProperties.getDescription(),
                swaggerConfigProperties.getConcat(),
                swaggerConfigProperties.getVersion()
        );
    }
}
