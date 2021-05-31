package com.example.demo.service;

import com.example.demo.model.ChatMessage;

import java.util.List;

public interface IChatMessageService {
    ChatMessage save(ChatMessage chatMessage);
    List<ChatMessage> findAll();
}
