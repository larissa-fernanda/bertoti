package com.observer;

import com.observer.AntiPattern.User;
import com.observer.AntiPattern.GroupChat;
import com.observer.pattern.ChatUser;
import com.observer.pattern.GroupChat;
import com.observer.pattern.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        User antiUser1 = new User("Alice");
        User antiUser2 = new User("Bob");
        User antiUser3 = new User("Charlie");

        GroupChat antiGroupChat = new GroupChat();

        antiGroupChat.addUser(antiUser1);
        antiGroupChat.addUser(antiUser2);
        antiGroupChat.addUser(antiUser3);


        antiGroupChat.removeUser(antiUser2);


        antiGroupChat.sendMessage(antiUser1, "Olá pessoal!");

        com.observer.pattern.GroupChat patternChatRoom = new com.observer.pattern.GroupChat();
        com.observer.pattern.User patternUser1 = new com.observer.pattern.ChatUser("Alice");
        com.observer.pattern.User patternUser2 = new com.observer.pattern.ChatUser("Bob");

        patternChatRoom.addUser(patternUser1);
        patternChatRoom.addUser(patternUser2);

        patternChatRoom.sendMessage("Olá pessoal!");
    }
}