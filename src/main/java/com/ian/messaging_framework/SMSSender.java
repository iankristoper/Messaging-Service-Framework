package com.ian.messaging_framework;

/**
 *
 * @author Ian Tagano
 */

public class SMSSender implements MessageSender
{
    @Override
    public void sendMessage(String recipient, String message)
    {
        // Logic to send SMS message
        System.out.println("SMS sent to " + recipient + ": " + message);
    }
    
}
