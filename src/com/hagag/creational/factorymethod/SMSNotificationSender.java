package com.hagag.creational.factorymethod;

public class SMSNotificationSender extends NotificationSender {

    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
