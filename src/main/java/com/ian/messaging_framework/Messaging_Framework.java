package com.ian.messaging_framework;



public class Messaging_Framework 
{

    public static void main(String[] args) 
    {
        //creating instances of message senders 
        MessageSender emailSender = new EmailSender();
        MessageSender smsSender = new SMSSender();
        MessageSender pushNotificationSender = new PushNotifications();
        
        // Send messages using different protocols
        emailSender.sendMessage("example@example.com", "Hello, this is an email message!");
        smsSender.sendMessage("+123456789", "Hello, this is an SMS message!");
        pushNotificationSender.sendMessage("user123", "Hello, this is a push notification message!");
    }
}
