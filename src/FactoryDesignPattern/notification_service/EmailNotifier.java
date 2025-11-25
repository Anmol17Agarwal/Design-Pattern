package FactoryDesignPattern.notification_service;

public class EmailNotifier implements Notifier{
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}
