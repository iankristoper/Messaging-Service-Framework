package com.ian.messaging_framework;



public class EmailSender implements MessageSender
{
    
    //Override the methods in the interface
    @Override
    public void sendMessage(String recipient, String message)
    {
        // Logic to send email message
        System.out.println("Email sent to " + recipient + ": " + message);
    }
}
