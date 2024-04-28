package com.observer.pattern;

public class ChatUser implements User{
    private String name;

    public ChatUser(String name){
        this.name = name;
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " recebeu a mensagem: " + message);
    }

}
