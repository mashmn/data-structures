package designpatterns.structural.bridge;

import org.junit.jupiter.api.Test;

public class MessageTest {

    @Test
    public void testSend() throws Exception {
        MessageSender textMessageSender = new TextMessageSender();
        Message textMessage = new TextMessage(textMessageSender);
        textMessage.send();

        MessageSender emailMessageSender = new EmailMessageSender();
        Message emailMessage = new EmailMessage(emailMessageSender);
        emailMessage.send();
    }
}
