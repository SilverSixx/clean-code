package DesignPattern.BehavioralPattern.State;

public class RedState implements State {

    @Override
    public void handleRequest() {
        System.out.println("Red State: Stop");
    }

}
