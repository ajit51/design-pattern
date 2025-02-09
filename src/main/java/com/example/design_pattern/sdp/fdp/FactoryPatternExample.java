package com.example.design_pattern.sdp.fdp;

public class FactoryPatternExample {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.getNotification("email");
        notification.notifyUser();

        notification = NotificationFactory.getNotification("sms");
        notification.notifyUser();

        notification = NotificationFactory.getNotification("push");
        notification.notifyUser();

        notification = NotificationFactory.getNotification("test");
        notification.notifyUser();
    }
}
