package SDP_assignment5;

public class ChatFacade {
    private ChatServer server;
    private NotificationService notifier;
    private Logger logger;

    public ChatFacade() {
        server = new ChatServer();
        notifier = new NotificationService();
        logger = new Logger();
    }

    public void sendMessage(Message message) {
        server.connect();
        server.send(message.getContent());
        notifier.notifyUser();
        logger.log("Message sent: " + message.getContent());
    }
}
