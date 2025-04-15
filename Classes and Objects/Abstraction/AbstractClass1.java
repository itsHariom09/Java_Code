package Abstraction;

public class AbstractClass1 {
    public static void main(String[] args) {
        Dog1 d= new Dog1();
        d.eat();
        d.sound();
        System.out.println("Dog color: " + d.color);
    }
}

abstract class Animal1 {
    String color;
    Animal1(){
        color = "white";
    }
    void eat() {
        System.out.println("This animal eats food.");
    }
    abstract void sound();
}
class Dog1 extends Animal1 {
    Dog1(){
        color = "black";
    }
    void sound() {
        System.out.println("The dog barks.");
    }
}
