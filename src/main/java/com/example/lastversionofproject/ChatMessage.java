package com.example.lastversionofproject;



import java.io.*;
import java.util.ArrayList;

public class ChatMessage implements Serializable {

    private ArrayList<User> liked=new ArrayList<>();

    static final int WHOISIN = 0, MESSAGE = 1, LOGOUT = 2;
    private int type;
    private String message;
    private chanel ch;
    private String replied;
    private int likedcount;

    // constructor
    ChatMessage(int type, String message,chanel ch) {
        this.type = type;
        this.message = message;
        this.ch=ch;
    }

    public void setReplied(String cm){
        this.replied=cm;
    }

    int getType() {
        return type;
    }

    String getMessage() {
        return message;
    }
    chanel getChanel(){
        return ch;
    }

    public void addliked(User user){

        likedcount++;

        liked.add(user);

    }
    public void showliker(){

        for(User u:liked){
            System.out.println(u.getUsername());
        }

    }
    public void showcount(){
        System.out.println(likedcount);
    }


}
