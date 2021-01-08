package com.beniregev.java8lambdasbasic;

public class GreetingImpl implements IGreeting {
    @Override
    public void perform() {
        System.out.println("Hello World!");
    }
}
