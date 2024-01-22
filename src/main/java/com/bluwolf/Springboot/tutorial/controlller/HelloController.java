package com.bluwolf.Springboot.tutorial.controlller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@PropertySources({
//        @PropertySource("classpath:custom.properties"),
//        @PropertySource("classpath:application.properties")
//})
public class HelloController {

//    @Value("${welcome.custom.message}")
//    private String welcomeCustomMessage;
//    @Value("${welcome.message}")
//    private String welcomeMessage;



    @GetMapping("/")
    public String helloWorld(){
//        return welcomeMessage + "################" + welcomeCustomMessage ;
        return "Hello Blu Wolf";

    }

}
