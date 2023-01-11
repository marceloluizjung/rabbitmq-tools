package io.github.marceloluizjung.rabbitmqtools.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping("send")
    public ResponseEntity sendMessage() {
        messageService.sendMessage();
        return ResponseEntity.ok().build();
    }
}