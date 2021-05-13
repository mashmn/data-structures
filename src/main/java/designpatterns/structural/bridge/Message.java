package designpatterns.structural.bridge;

/**
 * Bridge Pattern helps decouple the abstraction and implementation by creating 2 separate class hierarchies.
 */
public abstract class Message {
    MessageSender messageSender;
    public Message(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    abstract public void send();
}
