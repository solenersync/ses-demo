package com.solenersync.sesdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        System.out.println("sending response");
        return "Hello from Solenersync";
    }
}
