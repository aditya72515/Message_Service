package com.example.Message_Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    /*@Qualifier("EmailService")
    @Autowired
    private MessageService newService;

    @Qualifier("SMSService")
    @Autowired
    private MessageService newService1;*/

    private MessageService emailService;
    private MessageService smsService;

    public void sendNotification(String message) {
        // Business logic for sending notification
        emailService.sendMessage(message);
        smsService.sendMessage(message);
    }

    // Setter method for manual injection
    public void setServiceDependency(MessageService messageService) {
        this.emailService = messageService;
    }
}
