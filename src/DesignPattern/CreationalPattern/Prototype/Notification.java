package DesignPattern.CreationalPattern.Prototype;

public interface Notification extends Cloneable{
    Notification clone() throws CloneNotSupportedException;
    void sendNotification();
}
