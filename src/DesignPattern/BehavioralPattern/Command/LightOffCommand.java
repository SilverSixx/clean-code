package DesignPattern.BehavioralPattern.Command;

public class LightOffCommand {

    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOff();
    }

    public void undo() {
        light.turnOn();
    }

}
