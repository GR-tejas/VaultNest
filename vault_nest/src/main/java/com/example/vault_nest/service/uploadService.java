package com.example.vault_nest.service;

//import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class uploadService {

    String uploadDirectory = "G:\\Volume H stuff\\LocalCloudStorage";
    //String uploadDirectory = "C:\\Users\\wasis\\Desktop\\LocalCloudProject\\CloudStorage";

    public String uploadFile(MultipartFile file) {
        
        try {

            Path userDirectory = Paths.get(uploadDirectory, "user1");

            Files.createDirectories(userDirectory);

            Path filePath = Paths.get(userDirectory.toString(), file.getOriginalFilename());
            file.transferTo(filePath);

            return "File uploaded successfully: " + file.getOriginalFilename();

        } catch (IOException e) {
            return "Failed to upload file";
        }
        
    }
}
