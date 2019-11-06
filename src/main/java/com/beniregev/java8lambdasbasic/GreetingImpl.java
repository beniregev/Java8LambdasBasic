package com.beniregev.java8lambdasbasic;

public class GreetingImpl implements Greeting {
    @Override
    public void perform() {
        System.out.println("Hello World!");
    }
}
