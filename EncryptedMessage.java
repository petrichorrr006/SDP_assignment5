package SDP_assignment5;

public class EncryptedMessage extends MessageDecorator {

    public EncryptedMessage(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return "[Encrypted] " + message.getContent();
    }
}
