package com.inventorymanagementsystem.server.dto.request;

public class ReplyRequest {
    private String email;
    private String message;

    // Constructors
    public ReplyRequest() {}

    public ReplyRequest(String email, String message) {
        this.email = email;
        this.message = message;
    }

    // Getters and Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
