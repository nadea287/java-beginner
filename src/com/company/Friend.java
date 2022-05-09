package com.company;

public class Friend {
    String name;
    static int numberOfFriends;

    Friend(String name)
    {
        this.name = name;
        numberOfFriends++;
    }

    static void displayFriendsNumber()
    {
        System.out.println("you have " + numberOfFriends + " friends");
    }
}
