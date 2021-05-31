package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "chats")
public class ChatMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long idReceiver;
    @Lob
    private String content;
    private Date timeStamp;
    @ManyToOne
    User user;
    public ChatMessage() {
    }

    public ChatMessage(Long id,  Long idReceiver, String content,Date timeStamp, User user) {
        this.id = id;
        this.idReceiver = idReceiver;
        this.content = content;
        this.timeStamp = timeStamp;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getIdReceiver() {
        return idReceiver;
    }

    public void setIdReceiver(Long idReceiver) {
        this.idReceiver = idReceiver;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }
}
