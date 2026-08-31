package com.example.vault_nest.service;

import org.springframework.stereotype.Service;

import com.example.vault_nest.Repository.UserRepository;
import com.example.vault_nest.dto.Authentication.AuthenticationRequestDto;
import com.example.vault_nest.dto.Authentication.authenticationResponse;
import com.example.vault_nest.entity.User;

@Service
public class authenticationService {

    public UserRepository userRepository;

    public authenticationService(UserRepository _userRepository) {
        userRepository = _userRepository;
    }

    public authenticationResponse userLogin(AuthenticationRequestDto req)
    {
        if(!userRepository.findByUsername(req.getUsername()).isPresent()) {
            return new authenticationResponse("Username does not exist!", true);
        }

        return new authenticationResponse("User found!", false);
    }

    public authenticationResponse userRegister(AuthenticationRequestDto req)
    {
        if(userRepository.findByUsername(req.getUsername()).isPresent()) {
            return new authenticationResponse("Username already exist!", true);
        }

        userRepository.save(new User(req.getUsername(), req.getPassword()));
        return new authenticationResponse("User registered!", false);
    }
}
