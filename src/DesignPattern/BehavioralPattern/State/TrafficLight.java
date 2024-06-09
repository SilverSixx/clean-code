package DesignPattern.BehavioralPattern.State;

public class TrafficLight {

    private State state;

    public TrafficLight() {
        state = new RedState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void handleChangeRequest() {
        state.handleRequest();
    }

}
