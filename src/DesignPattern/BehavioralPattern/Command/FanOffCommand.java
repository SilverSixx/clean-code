package DesignPattern.BehavioralPattern.Command;

public class FanOffCommand {

    private final Fan fan;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        fan.turnOff();
    }

    public void undo() {
        fan.turnOn();
    }

}
