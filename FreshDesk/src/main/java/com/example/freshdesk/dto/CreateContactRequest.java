package com.example.freshdesk.dto;

public class CreateContactRequest {
    private String name;
    private String email;

    public CreateContactRequest() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
