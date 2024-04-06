package com.ian.messaging_framework;

/**
 *
 * @author Ian Tagano
 */

public interface MessageSender 
{
    void sendMessage(String recipient, String message);
}
