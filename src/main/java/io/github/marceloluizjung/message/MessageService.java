package io.github.marceloluizjung.message;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class MessageService {

    public void sendMessage() {
        Logger.getLogger("MessageService").warning("sendMessage");
    }
}
