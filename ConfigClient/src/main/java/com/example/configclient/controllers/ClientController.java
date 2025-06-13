package com.example.configclient.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class ClientController {

    @GetMapping("/name")
    public String getName() {
        return "Name is here...";
    }

    @GetMapping("/address")
    public String address() {
        return "Address is here...";
    }

    @GetMapping("/age")
    public String age() {
        return "Age is here...";
    }
}
