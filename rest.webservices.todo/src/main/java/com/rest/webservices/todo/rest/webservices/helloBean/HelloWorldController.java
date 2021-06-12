package com.rest.webservices.todo.rest.webservices.helloBean;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello-world")
    public String helloWorld( ){
        return  "hellow world ";
    }



    @GetMapping(path = "/hello-world-bean")
    public HellowWorldBean helloWorldBean(){
        return new HellowWorldBean("hello world");
//        throw new RuntimeException("some error has happened");
    }


    @GetMapping(path = "/hello-world/path-varible/{name}")
    public HellowWorldBean helloWorldBean(@PathVariable String name ){
        return new HellowWorldBean(name);
//        throw new RuntimeException("some error has happened");
    }

}
