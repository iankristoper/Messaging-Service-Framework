package com.ian.messaging_framework;



public class PushNotifications implements MessageSender
{
    @Override
    public void sendMessage(String recipient, String message)
    {
        // Logic to send push notification message
        System.out.println("Push notification sent to " + recipient + ": " + message);
    }
}
