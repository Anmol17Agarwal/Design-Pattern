package FactoryDesignPattern.notification_service;

public class NotificationClient {
    public static void main(String[] args) throws IllegalAccessException {

        Notifier emailNotifier = NotificationFactory.getNotifier(NotificationType.EMAIL);
        emailNotifier.sendNotification("Welcome!");

        Notifier smsNotifier = NotificationFactory.getNotifier(NotificationType.SMS);
        smsNotifier.sendNotification("Your OTP is 1234");
    }
}
