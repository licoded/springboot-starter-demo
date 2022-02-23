package site.licoded.demo.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import site.licoded.demo.entity.PersonEntity;

@Configuration
public class PersonBeanManualConfiguration {

    @Bean
    public PersonEntity personBean() {
        return new PersonEntity("Jack", 19);
    }
}