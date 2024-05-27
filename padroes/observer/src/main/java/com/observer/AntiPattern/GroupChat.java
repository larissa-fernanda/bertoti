package com.observer.AntiPattern;

import java.util.ArrayList;
import java.util.List;

public class GroupChat {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void sendMessage(User sender, String message){
        for(User user : users){
            if(user != sender){
                System.out.println(user.getName() + " recebeu mensagem: " + message);
            }
        }
    }

}
