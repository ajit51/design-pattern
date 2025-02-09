package com.example.design_pattern.sdp.fdp;

public class PushNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending a Push Notification...");
    }
}
