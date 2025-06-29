package com.hagag.creational.factorymethod;

public class Main {
    public static void main(String[] args) {
        NotificationSender sender;
        String type = "EMAIL";

        switch(type.toLowerCase()) {
            case "email":
                sender = new EmailNotificationSender();
                break;
            case "sms":
                sender = new SMSNotificationSender();
                break;
            case "push":
                sender = new PushNotificationSender();
                break;
            default:
                throw new IllegalArgumentException("Invalid type");
        }
        sender.sendNotification();
    }
}
