package site.licoded.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.licoded.demo.entity.PersonEntity;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonEntity personBean;

    @RequestMapping("/print")
    public String sayHello(){
        return personBean.toString();
    }
}
