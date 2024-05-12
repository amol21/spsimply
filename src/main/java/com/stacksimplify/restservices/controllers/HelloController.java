package com.stacksimplify.restservices.controllers;

import com.stacksimplify.restservices.dtos.UserDetails;
import de.codecentric.boot.admin.client.registration.Application;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String testHello()
{
    return "welcome back spring boot world!!";
}

    @GetMapping(value = "/getUsers",produces = MediaType.APPLICATION_JSON_VALUE)

    public UserDetails getUserDetails()
    {
        return new UserDetails("kalyan","ready","banglore");
    }
}
