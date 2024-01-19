package com.example.Message_Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
@Service
public class MessageController {

    private final MessageService messageService;


    public MessageController(MessageService emailService) {
        this.messageService = emailService;
    }

    @GetMapping("/send")
    public String sendMessage(@RequestParam String message) {
        messageService.sendMessage(message);
        return "Message sent successfully!";
    }
}
