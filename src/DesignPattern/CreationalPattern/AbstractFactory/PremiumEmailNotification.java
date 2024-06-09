package DesignPattern.CreationalPattern.AbstractFactory;

public class PremiumEmailNotification implements PremiumNotification  {
    @Override
    public void notifyUser() {
        System.out.println("Sending premium email notification");
    }

    @Override
    public void praiseUser() {

    }
}
