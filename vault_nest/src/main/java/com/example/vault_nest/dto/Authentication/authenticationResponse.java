package com.example.vault_nest.dto.Authentication;

public class authenticationResponse {
    private String message;
    private boolean isError;

    // Default constructor
    public authenticationResponse() {
    }

    // Parameterized constructor
    public authenticationResponse(String message, boolean isError) {
        this.message = message;
        this.isError = isError;
    }

    // Getters and Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String username) {
        this.message = username;
    }

    public boolean getIsError() {
        return isError;
    }

    public void setIsError(boolean isError) {
        this.isError = isError;
    }
}
