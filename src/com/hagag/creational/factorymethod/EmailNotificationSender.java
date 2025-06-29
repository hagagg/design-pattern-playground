package com.hagag.creational.factorymethod;

public class EmailNotificationSender extends NotificationSender {

    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
