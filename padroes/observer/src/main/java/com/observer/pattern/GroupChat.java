package com.observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class GroupChat implements ChatRoom{
    private List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void removeUser(User user) {
        users.remove(user);
    }

    @Override
    public void notifyUsers(String message) {
        for(User user : users){
            user.receiveMessage(message);
        }
    }

    public void sendMessage(String message){
        notifyUsers(message);
    }

}
