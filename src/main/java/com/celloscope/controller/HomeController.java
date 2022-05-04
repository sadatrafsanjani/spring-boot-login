package com.celloscope.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/hello/{name}")
    public ResponseEntity<String> home(@PathVariable("name") String name){

        return ResponseEntity.ok("Hello from " + name);
    }

    @RequestMapping("/login")
    public String login() {

        return "login";
    }

    @RequestMapping("/home")
    public String home() {

        return "home";
    }

    @RequestMapping("/logout")
    public String logout() {

        return "login";
    }

}
