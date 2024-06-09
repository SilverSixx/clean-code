package DesignPattern.BehavioralPattern.Mediator;

public abstract class User {
    protected final ChatMediator mediator;
    protected final String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message);
}

