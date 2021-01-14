package com.spring.accountmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *Created by olga on 14.01.2021
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping("/status/check")
    public String status() {
        return "Working..";
    }
}
