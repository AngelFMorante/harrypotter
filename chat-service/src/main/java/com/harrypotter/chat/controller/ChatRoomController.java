package com.harrypotter.chat.controller;

import com.harrypotter.chat.entity.ChatRoom;
import com.harrypotter.chat.service.ChatRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chatrooms")
public class ChatRoomController {

    @Autowired
    private ChatRoomService chatRoomService;

    @GetMapping
    public List<ChatRoom> getAllChatRooms() {
        return chatRoomService.findAll();
    }

    @PostMapping
    public ChatRoom createChatRoom(@RequestBody ChatRoom chatRoom) {
        return chatRoomService.save(chatRoom);
    }

    @GetMapping("/{id}")
    public ChatRoom getChatRoomById(@PathVariable Long id) {
        return chatRoomService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteChatRoom(@PathVariable Long id) {
        chatRoomService.deleteById(id);
    }
}