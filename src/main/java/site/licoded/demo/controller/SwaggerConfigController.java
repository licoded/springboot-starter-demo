package site.licoded.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.licoded.starter.entity.SwaggerConfigEntity;

@RestController
@RequestMapping("/swaggerConfig")
public class SwaggerConfigController {
    @Autowired
    private SwaggerConfigEntity swaggerConfigBean;

    @RequestMapping(value="/print")
    public String sayHello(){
        return swaggerConfigBean.toString();
    }
}
