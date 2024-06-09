package DesignPattern.BehavioralPattern.State;

public class YellowState implements State {

    @Override
    public void handleRequest() {
        System.out.println("Yellow State: Slow Down");
    }
}
