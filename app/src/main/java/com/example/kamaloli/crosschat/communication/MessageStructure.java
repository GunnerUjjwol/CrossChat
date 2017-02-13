package com.example.kamaloli.crosschat.communication;

import java.util.Random;

/**
 * Created by KAMAL OLI on 06/02/2017.
 */

public class MessageStructure {
    public String senderName;
    public String myName;
    public String date,time;
    public String message;
    public String messageId;
    boolean didIComposeIt;
    public MessageStructure(String senderName,String receiverName,String message,String messageId,boolean didIComposeIt){
        this.senderName=senderName;
        this.myName=receiverName;
        this.message=message;
        this.messageId=getMessageId(messageId);
        this.didIComposeIt=didIComposeIt;
    }
    public String getMessageId(String messageId){
        messageId="-"+String.format("%02",new Random().nextInt());
        return messageId;
    }
}
