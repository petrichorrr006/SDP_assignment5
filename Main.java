package SDP_assignment5;

public class Main {
    public static void main(String[] args) {
        Message msg = new TextMessage("Hello, world!");

        msg = new EncryptedMessage(msg);
        msg = new EmojiMessage(msg);

        ChatFacade chat = new ChatFacade();
        chat.sendMessage(msg);
    }
}
