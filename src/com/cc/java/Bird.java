package com.cc.java;

public class Bird implements Flyable,IFeathers {

    @Override
    public String fly() {
        
        return "I'm Bird ,i can also fly";
    }

    @Override
    public String hasfeathers() {
        
        return "I'm Bird ,i have feathers";
    }

  
    
    
}
