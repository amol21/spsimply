package com.stacksimplify.restservices.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
@GetMapping()
    public String testHello()
{
    return "welcome back spring boot world!!";
}

}
