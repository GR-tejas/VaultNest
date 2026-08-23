package com.example.vault_nest.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.vault_nest.service.uploadService;

import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class uploadController {

    private final uploadService uploadService;

    public uploadController(uploadService _uploadService) {
        this.uploadService = _uploadService;
    }

    @PostMapping("/files/upload")
    public String postMethodName(@RequestParam("file") MultipartFile file) {
        return uploadService.uploadFile(file);
    }
    
}
