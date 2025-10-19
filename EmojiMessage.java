package SDP_assignment5;

public class EmojiMessage extends MessageDecorator {

    public EmojiMessage(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return message.getContent() + " 😊";
    }
}
