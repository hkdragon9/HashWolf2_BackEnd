package com.HashWolf2.hashwolf2.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/helloDemo")
    public String helloDemo() {
        return "hello";
    }
}
