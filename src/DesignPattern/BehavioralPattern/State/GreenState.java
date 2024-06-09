package DesignPattern.BehavioralPattern.State;

public class GreenState implements State {
    @Override
    public void handleRequest() {
        System.out.println("Green State: Go");
    }
}
