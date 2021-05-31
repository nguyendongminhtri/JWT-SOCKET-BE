package com.example.demo.controller;

import com.example.demo.model.ChatMessage;
import com.example.demo.model.User;
import com.example.demo.security.userprincal.UserDetailServiceImpl;
import com.example.demo.service.impl.ChatMessagerServiceImpl;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RequestMapping("/api/auth")
@RestController
public class ChatMessageController {
    @Autowired
    ChatMessagerServiceImpl chatMessagerService;
    @PostMapping("/chat")
    public ResponseEntity<?> chatMessage(@Valid @RequestBody ChatMessage chatMessage){
        chatMessagerService.save(chatMessage);
        return new ResponseEntity<>(chatMessage.getContent(),HttpStatus.OK);
    }
    @GetMapping("/chat")
    public ResponseEntity<?> getListChat(){
        List<ChatMessage> chatMessages = chatMessagerService.findAll();
        return new ResponseEntity<>(chatMessages, HttpStatus.OK);
    }
}
