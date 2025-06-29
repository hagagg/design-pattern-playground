package com.hagag.creational.factorymethod;

public abstract class NotificationSender {

    public abstract Notification createNotification();

    public void sendNotification() {
        Notification notification = createNotification();
        notification.notifyUser();
    }
}
