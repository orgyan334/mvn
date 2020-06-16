package com.example.demo.cont;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 29192 on 2020/6/16.
 */
@Controller
public class Hollo {
    @RequestMapping("/hello")
    public String hello(){
return "hello";
    }
}
