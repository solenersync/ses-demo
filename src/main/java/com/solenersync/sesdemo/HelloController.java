package com.solenersync.sesdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        System.out.println("sending response");
        return "Hello from Solenersync";
    }

    @PostMapping("/user")
    public String user(@RequestBody String user) {
        System.out.println("sending user back..");
        return "Hello there from a new " + user + " app3";
    }
}
