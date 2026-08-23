package com.example.vault_nest.service;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class uploadService {
    //String uploadDirectory = "G:\\Volume H stuff\\LocalCloudStorage";
    String uploadDirectory = "C:\\Users\\wasis\\Desktop\\LocalCloudProject\\CloudStorage";
    public String uploadFile(MultipartFile file) {
        
        try {
            file.transferTo(new File(uploadDirectory + file.getOriginalFilename()));

            return "File uploaded successfully: " + file.getOriginalFilename();

        } catch (IOException e) {
            return "Failed to upload file";
        }
        
    }
}
