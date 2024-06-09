package DesignPattern.BehavioralPattern.Command;

public class FanOnCommand {

    private final Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        fan.turnOn();
    }

    public void undo() {
        fan.turnOff();
    }

}
