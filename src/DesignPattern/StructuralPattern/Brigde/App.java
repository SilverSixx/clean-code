package DesignPattern.StructuralPattern.Brigde;

// @SpringBootApplication
public class App {

//    public static void main(String[] args) {
//        SpringApplication.run(BridgePatternApplication.class, args);
//    }

    //@Bean
    public NotificationSender webNotificationSender() {
        return new WebNotiSender();
    }

    //@Bean
    public NotificationSender mobileNotificationSender() {
        return new MobileNotiSender();
    }

    // @Bean
    public Notification emailNotification(NotificationSender webNotificationSender) {
        return new EmailNoti(webNotificationSender);
    }

    // @Bean
    public Notification smsNotification(NotificationSender mobileNotificationSender) {
        return new SMSNoti(mobileNotificationSender);
    }
}

