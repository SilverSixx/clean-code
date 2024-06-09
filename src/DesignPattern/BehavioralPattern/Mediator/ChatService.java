package DesignPattern.BehavioralPattern.Mediator;

public class ChatService {

    private final ChatMediator chatMediator;

    public ChatService(ChatMediator chatMediator) {
        this.chatMediator = chatMediator;
    }

    public void startChat() {
        User user1 = new BasicUser(chatMediator, "User1");
        User user2 = new BasicUser(chatMediator, "User2");
        User user3 = new BasicUser(chatMediator, "User3");

        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);

        user1.sendMessage("Hello, everyone!");
    }
}

