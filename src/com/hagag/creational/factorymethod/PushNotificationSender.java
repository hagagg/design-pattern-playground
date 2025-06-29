package com.hagag.creational.factorymethod;

public class PushNotificationSender extends NotificationSender {

    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
