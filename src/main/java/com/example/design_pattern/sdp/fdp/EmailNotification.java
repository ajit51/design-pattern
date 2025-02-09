package com.example.design_pattern.sdp.fdp;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending an Email Notification...");
    }
}
