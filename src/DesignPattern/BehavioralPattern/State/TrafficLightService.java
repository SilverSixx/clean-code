package DesignPattern.BehavioralPattern.State;

public class TrafficLightService {

    private final TrafficLight trafficLight;

    public TrafficLightService() {
        trafficLight = new TrafficLight();
    }

    public void changeState() {
        trafficLight.handleChangeRequest();
        trafficLight.setState(new GreenState());
        trafficLight.handleChangeRequest();
        trafficLight.setState(new RedState());
        trafficLight.handleChangeRequest();
        trafficLight.setState(new YellowState());
        trafficLight.handleChangeRequest();
    }
}
