package site.licoded.demo.bean;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import site.licoded.demo.configProperties.PersonProperties;
import site.licoded.demo.entity.PersonEntity;

@Configuration
@EnableConfigurationProperties(PersonProperties.class)
public class PersonBeanAutoConfiguration {
    private final PersonProperties personProperties;

    // 通过构造方法获取配置属性对象PersonProperties
    public PersonBeanAutoConfiguration(PersonProperties personProperties) {
        this.personProperties = personProperties;
    }

    // 实例化PersonEntity为Bean，放入SpringIoc容器
    @Bean
    public PersonEntity personBean(){
        return new PersonEntity(personProperties.getName(), personProperties.getAge());
    }
}