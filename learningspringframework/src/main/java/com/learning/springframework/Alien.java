package com.learning.springframework;

public class Alien {

    private int age;
    private Laptop laptop;

    public Alien(int age, Laptop laptop) {
        this.age = age;
        this.laptop = laptop;
    }

    public int getAge() {
        return age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Alien() {
        System.out.println("Object of Alien class is created.");
    }

    public void Coding(){
        //System.out.println("Age of Alien is: "+ this.age);
        System.out.println("Coding..."+ this.hashCode());
    }

    public void show(){
        this.Coding();
        System.out.println("Age of Alien is: "+ this.age);
        laptop.compile();
    }

}
