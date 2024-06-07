package com.harrypotter.chat.controller;

import com.harrypotter.chat.entity.Message;
import com.harrypotter.chat.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping
    public List<Message> getAllMessages() {
        return messageService.findAll();
    }

    @PostMapping
    public Message createMessage(@RequestBody Message message) {
        return messageService.save(message);
    }

    @GetMapping("/{id}")
    public Message getMessageById(@PathVariable Long id) {
        return messageService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteMessage(@PathVariable Long id) {
        messageService.deleteById(id);
    }
}