package com.example.ContactManager.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {


    @GetMapping("/test")
    public  String Test(){

        return "about1";
    }
}
