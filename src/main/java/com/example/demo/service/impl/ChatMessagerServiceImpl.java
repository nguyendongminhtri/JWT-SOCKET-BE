package com.example.demo.service.impl;

import com.example.demo.model.ChatMessage;
import com.example.demo.model.User;
import com.example.demo.repository.IChatMessageRepository;
import com.example.demo.security.userprincal.UserDetailServiceImpl;
import com.example.demo.service.IChatMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatMessagerServiceImpl implements IChatMessageService {
    @Autowired
    IChatMessageRepository chatMessageRepository;
    @Autowired
    UserDetailServiceImpl userDetailService;
    @Override
    public ChatMessage save(ChatMessage chatMessage) {
        User user = userDetailService.getCurrentUser();
        chatMessage.setUser(user);
        return chatMessageRepository.save(chatMessage);
    }

    @Override
    public List<ChatMessage> findAll() {
        return chatMessageRepository.findAll();
    }
}
