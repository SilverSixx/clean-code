package DesignPattern.CreationalPattern.Prototype;

import java.util.HashMap;
import java.util.Map;

public class NotificationPrototypeRegistry {

    private Map<String, Notification> prototypes = new HashMap<>();

    public NotificationPrototypeRegistry() {
        // Initialize with some prototypes
        prototypes.put("EMAIL", new EmailNotification("Default Email Message"));
        prototypes.put("SMS", new SMSNotification("Default SMS Message"));
    }

    public Notification getPrototype(String type) throws CloneNotSupportedException {
        Notification prototype = prototypes.get(type);
        if (prototype != null) {
            return prototype.clone();
        }
        throw new IllegalArgumentException("Prototype not found for type: " + type);
    }
}
