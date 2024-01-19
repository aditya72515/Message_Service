package com.example.Message_Service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Initialize the Spring context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Start the web server
        context.registerShutdownHook();

        // Constructor Injection
        NotificationService emailNotificationService = context.getBean(NotificationService.class);
        emailNotificationService.sendNotification("Constructor injection example");

        // Setter Injection
        NotificationService smsNotificationService = context.getBean(NotificationService.class);
        smsNotificationService.setServiceDependency(context.getBean(SMSService.class));
        smsNotificationService.sendNotification("Setter injection example");

        // Method Injection
        NotificationService anotherEmailNotificationService = context.getBean(NotificationService.class);
        anotherEmailNotificationService.setServiceDependency(context.getBean(EmailService.class));
        anotherEmailNotificationService.sendNotification("Method injection example");

        // Close the context
        context.close();
    }
}
