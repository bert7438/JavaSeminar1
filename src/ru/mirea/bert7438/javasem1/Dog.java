package ru.mirea.bert7438.javasem1;

public class Dog {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name){
        this.name = name;
        this.age = 0;
    }

    public Dog(){
        this.name = "Sharik";
        this.age = 0;
    }

    @Override
    public String toString(){
        return "This is a dog called " + name + " and its age is " + age;
    }

    public String toHumanAge(){
        return this.name + "'s age in human years is " + this.age*7;
    }

}
