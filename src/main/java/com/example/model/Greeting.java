package com.example.model;
public class Greeting {
    private String requestMessage;

    public Greeting(String requestMessage){
        this.requestMessage = requestMessage;
    }

    public String reply() {
        return requestMessage;
    }
}
