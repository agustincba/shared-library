package com.shared.pocsharedlibrary;

public class HelloManager {
    private String name;

    public HelloManager(String name) {
        this.name = name;
    }
    
    public String sayHello(){
        return "Hello " + name;
    }
}
