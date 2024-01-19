package com.example.Message_Service;

import org.springframework.stereotype.Service;

//@Service("EmailService")
public class EmailService implements MessageService {
    // Implementation of MessageService
    @Override
    public void sendMessage(String message) {
        // Implementation for sending email
        System.out.println("Sending Email: " + message);
    }
}
