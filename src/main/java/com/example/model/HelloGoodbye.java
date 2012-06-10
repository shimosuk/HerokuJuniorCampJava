package com.example.model;

import java.util.Map;
import java.util.HashMap;

public class HelloGoodbye {
    private String youSay;
    private Map<String, String> sing;

    public HelloGoodbye(String youSay){
        this.youSay = youSay;
        this.sing = sing();
    }

    public String iSay() {
        return this.sing.get(youSay);
    }

    private Map<String, String> sing() {
        Map<String, String> sing = new HashMap<String, String>();
        sing.put("yes", "no");
        sing.put("stop", "go");
        sing.put("goodbye", "hello");
        sing.put("high", "low");
        sing.put("why", "I don't know");
        return sing;
    }
}
