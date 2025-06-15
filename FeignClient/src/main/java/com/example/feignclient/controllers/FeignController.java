package com.example.feignclient.controllers;

import com.example.feignclient.util.FeignServiceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class FeignController {
    private final FeignServiceUtil feignServiceUtil;

    @Autowired
    public FeignController(FeignServiceUtil feignServiceUtil) {
        this.feignServiceUtil = feignServiceUtil;
    }

    @GetMapping("/username")
    public String getUserName() {
        return feignServiceUtil.getName();
    }

    @GetMapping("/useraddress")
    public String getUserAddress() {
        return feignServiceUtil.getAddress();
    }

    @GetMapping("/userAge")
    public String getUserAge() {
        return feignServiceUtil.getAge();
    }
}
