package com.example.vault_nest.service;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class uploadService {
    public String uploadFile(MultipartFile file) {
        
        try {
            file.transferTo(new File("G:\\Volume H stuff\\LocalCloudStorage" + file.getOriginalFilename()));

            return "File uploaded successfully: " + file.getOriginalFilename();

        } catch (IOException e) {
            return "Failed to upload file";
        }
        
    }
}
