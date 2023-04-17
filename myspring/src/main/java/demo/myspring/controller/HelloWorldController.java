package demo.myspring.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

    @RequestMapping("/")
    String index() {
        return "Hello World spring boot !";
    }

}