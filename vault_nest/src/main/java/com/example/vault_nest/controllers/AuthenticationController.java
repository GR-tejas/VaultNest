package com.example.vault_nest.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.vault_nest.dto.Authentication.AuthenticationRequestDto;
import com.example.vault_nest.dto.Authentication.authenticationResponse;
import com.example.vault_nest.service.authenticationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
public class AuthenticationController {
    private final authenticationService authenticationService;

    public AuthenticationController(authenticationService _authenticationService){
        authenticationService = _authenticationService;
    }

    @PostMapping("/login")
    public authenticationResponse userLogin(@RequestBody AuthenticationRequestDto req) {
        return authenticationService.userLogin(req);
    }

    @PostMapping("/register")
    public authenticationResponse userRegister(@RequestBody AuthenticationRequestDto req) {
        return authenticationService.userRegister(req);
    }
}
