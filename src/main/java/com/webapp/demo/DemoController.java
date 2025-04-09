package com.webapp.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

    @RequestMapping("/")
    public String HomePage() {
        return "Bgiorno a tutti belli e brutti";
    }
    
    
}
