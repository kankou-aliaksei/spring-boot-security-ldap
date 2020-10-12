package com.security.ldap.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloWorldRestController {

    @GetMapping("admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String helloAdmin() {
        return "Hello, admin";
    }

    @GetMapping("user")
    @PreAuthorize("hasRole('USER')")
    public String helloUsers() {
        return "Hello, user";
    }

    @GetMapping("someone")
    public String helloAll() {
        return "Hello, someone";
    }
}

