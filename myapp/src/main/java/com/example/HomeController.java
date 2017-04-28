package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chaoqunshe on 4/17/17.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String index(){
        return "hello world spring boot ";
    }
}
