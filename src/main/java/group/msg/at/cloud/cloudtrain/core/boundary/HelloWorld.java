package group.msg.at.cloud.cloudtrain.core.boundary;

import group.msg.at.cloud.cloudtrain.core.entity.Message;
import jakarta.ejb.Stateless;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;
import java.util.UUID;

/**
 * Simple {@code Boundary} that returns welcome messages.
 */
@Stateless
public class HelloWorld {

    private final Logger log = LoggerFactory.getLogger(getClass());

    public Message getHelloMessage() {
        Message result = new Message(UUID.randomUUID());
        result.setCode("hello");
        result.setText("Welcome to Cloud Native Java with MicroProfile!");
        result.setLocale(Locale.ENGLISH);
        // Testing log behaviour in Payara Micro
        log.info("*** HELLO *** returning welcome message [{}]", result);
        return result;
    }
}
