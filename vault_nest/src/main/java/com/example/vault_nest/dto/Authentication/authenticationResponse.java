package com.example.vault_nest.dto.Authentication;

public class authenticationResponse {
    private String username;
    private String password;

    // Default constructor
    public authenticationResponse() {
    }

    // Parameterized constructor
    public authenticationResponse(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
