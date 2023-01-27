package com.solenersync.sesdemo;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/v1/ses-demo")
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
        return "Hello there from a new " + user + " app flux please work refactor YES!!!";
    }
}
