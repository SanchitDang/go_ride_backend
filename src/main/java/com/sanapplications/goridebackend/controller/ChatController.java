package com.sanapplications.goridebackend.controller;

import com.sanapplications.goridebackend.model.ChatMessageModel;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/public")
    public ChatMessageModel sendMessage(
            @Payload ChatMessageModel chatMessageModel
    ){
        return chatMessageModel;
    }

    @MessageMapping("/chat.addUser")
    @SendTo("/topic/public")
    public ChatMessageModel addUser(
            @Payload ChatMessageModel chatMessageModel,
            SimpMessageHeaderAccessor headerAccessor
    ){
        // Add username in web socket session
        headerAccessor.getSessionAttributes().put("username", chatMessageModel.getSender());
        return chatMessageModel;
    }
}
