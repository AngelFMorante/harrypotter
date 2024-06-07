package com.harrypotter.chat.service;

import com.harrypotter.chat.entity.Message;
import com.harrypotter.chat.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public List<Message> findAll() {
        return messageRepository.findAll();
    }

    public Message save(Message message) {
        return messageRepository.save(message);
    }

    public Message findById(Long id) {
        return messageRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        messageRepository.deleteById(id);
    }
}
