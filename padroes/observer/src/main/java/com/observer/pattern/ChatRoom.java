package com.observer.pattern;

public interface ChatRoom {
    void addUser(User user);
    void removeUser(User user);
    void notifyUsers(String message);
}
