package FactoryDesignPattern.notification_service;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class NotificationFactory {

    public static final Map<NotificationType, Supplier<Notifier>> map = new HashMap<>();

    static{
        map.put(NotificationType.EMAIL,EmailNotifier::new);
        map.put(NotificationType.SMS,SMSNotifier::new);
        map.put(NotificationType.PUSH,PushNotifier::new);
    }

    public static Notifier getNotifier(NotificationType type) throws IllegalAccessException {
        Supplier<Notifier> notifierSupplier = map.get(type);

        if(notifierSupplier!=null){
            return notifierSupplier.get();
        }
        throw new IllegalAccessException("Unknown Notification Type: "+type);
    }
}
