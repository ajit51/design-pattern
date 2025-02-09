package com.example.design_pattern.sdp.fdp;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS Notification...");
    }
}
