package com.example.Message_Service;

public class MessageControllerBuilder {
    private MessageService messageService;

    public MessageControllerBuilder setMessageService(MessageService messageService) {
        this.messageService = messageService;
        return this;
    }

    public MessageController createMessageController() {
        return new MessageController(messageService);
    }
}