package DesignPattern.BehavioralPattern.Command;

public class AutomationService {

    private final RemoteControl remoteControl;
    private final Command lightOnCommand;
    private final Command lightOffCommand;
    private final Command fanOnCommand;
    private final Command fanOffCommand;

    public AutomationService(RemoteControl remoteControl, Command lightOnCommand, Command lightOffCommand,
                                 Command fanOnCommand, Command fanOffCommand) {
        this.remoteControl = remoteControl;
        this.lightOnCommand = lightOnCommand;
        this.lightOffCommand = lightOffCommand;
        this.fanOnCommand = fanOnCommand;
        this.fanOffCommand = fanOffCommand;
    }

    public void turnOnLight() {
        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton();
    }

    public void turnOffLight() {
        remoteControl.setCommand(lightOffCommand);
        remoteControl.pressButton();
    }

    public void turnOnFan() {
        remoteControl.setCommand(fanOnCommand);
        remoteControl.pressButton();
    }

    public void turnOffFan() {
        remoteControl.setCommand(fanOffCommand);
        remoteControl.pressButton();
    }

    public void undoLastCommand() {
        remoteControl.pressUndo();
    }
}

