package com.learning.springframework;

public class Laptop implements Computer {

    public Laptop() {
        System.out.println("Object of Laptop class is created.");
    }
    @Override
    public void compile(){
        System.out.println("Compiling from the laptop object...");
    }

}
