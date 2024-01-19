package com.example.Message_Service;

import org.springframework.stereotype.Service;

//@Service("SMSService")
public class SMSService implements MessageService {
    // Implementation of MessageService
    @Override
    public void sendMessage(String message) {
        // Implementation for sending SMS
        System.out.println("Sending SMS: " + message);
    }
}
