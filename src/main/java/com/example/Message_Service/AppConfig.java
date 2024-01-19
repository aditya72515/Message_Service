package com.example.Message_Service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.Message_Service")
public class AppConfig {
    // Additional configuration if needed

    @Bean("emailService")
    public MessageService emailService() {
        return new EmailService();
    }

    @Bean("smsService")
    public MessageService smsService() {
        return new SMSService();
    }

}

