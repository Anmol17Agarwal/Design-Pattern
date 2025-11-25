package FactoryDesignPattern.notification_service;

public class PushNotifier implements Notifier{
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Push Notification: " + message);
    }
}
