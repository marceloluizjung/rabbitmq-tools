package io.github.marceloluizjung.rabbitmqtools.message;

import io.github.marceloluizjung.rabbitmqtools.RabbitMQUtils;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class MessageService implements RabbitMQUtils {

    @Override
    public void sendMessage() {
        Logger.getLogger("MessageService").warning("sendMessage");
    }
}
