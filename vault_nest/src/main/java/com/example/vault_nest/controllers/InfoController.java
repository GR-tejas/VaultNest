package com.example.vault_nest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    @GetMapping("/info")
    public String getInfo() {
        return "This is the InfoController";
    }
}
