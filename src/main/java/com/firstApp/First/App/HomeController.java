package com.firstApp.First.App;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(path = "/hello")
    public String helloWorld (){
        return "Hello Ramath";
    }
}
