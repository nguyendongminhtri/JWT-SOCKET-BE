package com.example.demo.controller;
import com.example.demo.model.User;
import com.example.demo.model.Hello;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.util.HtmlUtils;
@CrossOrigin("*")
@Controller
public class GreetingController {
    private static final Logger logger = LoggerFactory.getLogger(GreetingController.class);
        @MessageMapping("/hello")
        @SendTo("/topic/hi")
    public User greeting(Hello message) throws Exception {
        Thread.sleep(1000); // simulated delay
            logger.info("message =====> "+message);
        return new User(HtmlUtils.htmlEscape(message.getName()));
    }

}