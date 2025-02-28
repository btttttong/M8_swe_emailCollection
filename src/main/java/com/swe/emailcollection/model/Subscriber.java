package com.swe.emailcollection.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDateTime;

public class Subscriber {
    @NotBlank
    @Email
    private String email;
    private LocalDateTime createdAt;
    private String ipAddress;

    public Subscriber(String email, String ipAddress) {
        this.email = email;
        this.createdAt = LocalDateTime.now();
        this.ipAddress = ipAddress;
    }

    public String getEmail() { return email; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public String getIpAddress() { return ipAddress; }
}