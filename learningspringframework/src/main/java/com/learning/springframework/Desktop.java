package com.learning.springframework;

public class Desktop implements Computer {

    public Desktop() {
        System.out.println("Object of Desktop class is created.");
    }
    
    @Override
    public void compile(){
        System.out.println("Compiling from the desktop object...");
    }

}
