package com.example.vault_nest.service;

import org.springframework.stereotype.Service;

import com.example.vault_nest.Repository.UserRepository;
import com.example.vault_nest.dto.Authentication.AuthenticationRequestDto;

@Service
public class authenticationService {

    public UserRepository userRepository;

    public String userLogin(AuthenticationRequestDto user)
    {
        
        return "";
    }

    public String userRegister(AuthenticationRequestDto user)
    {
        
        return "";
    }
}
