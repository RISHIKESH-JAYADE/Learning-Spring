package com.learning.springframework;

public class NewAlien {
    private String name;
    private int age;
    private Computer comp;

    public NewAlien() {
        System.out.println("Object of NewAlien class is created.");
    }

    public NewAlien(String name, int age, Computer comp) {
        this.name = name;
        this.age = age;
        this.comp = comp;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Computer getComp() {
        return comp;
    }
    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void show(){
        System.out.println("Name of Alien is: "+ this.name);
        System.out.println("Age of Alien is: "+ this.age);
        comp.compile();
    }

}
