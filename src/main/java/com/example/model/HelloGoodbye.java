package com.example.model;

import java.util.Map;
import java.util.HashMap;

public class HelloGoodbye {
    private String youSay;
    private static Map<String, String> sing = new HashMap<String, String>();

    static {
        sing.put("yes", "no");
        sing.put("stop", "go");
        sing.put("goodbye", "hello");
        sing.put("high", "low");
        sing.put("why", "I don't know");
    }

    public HelloGoodbye(String youSay){
        this.youSay = youSay;
    }

    public String iSay() {
        return this.sing.containsKey(youSay)
               ? "I say " + this.sing.get(youSay)
               : "";
    }
}
