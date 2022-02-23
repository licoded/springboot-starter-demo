package site.licoded.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.licoded.demo.entity.PersonEntity;

@RestController
@RequestMapping("/person")
public class PersonController {
    /**
     * Autowired是Spring的注解
     * Autowired默认先按byType，
     * 如果发现找到多个bean，则，又按照byName方式比对，
     * 如果还有多个，则报出异常；
     */
    @Autowired
    private PersonEntity personBean;

    @RequestMapping("/print")
    public String sayHello(){
        return personBean.toString();
    }
}
