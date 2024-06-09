package DesignPattern.BehavioralPattern.Observer;

public class DisplayPanel implements Observer{

    private String weather;

    @Override
    public void update(String weather) {
        this.weather = weather;
        display();
    }

    private void display() {
        System.out.println("Display Panel: Current weather is " + weather);
    }
}
