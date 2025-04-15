package Abstraction;

public class AbstractClass {
    public static void main(String[] args) {
        Dog d= new Dog();
        d.eat();
        d.sound();
        Cat c= new Cat();
        c.eat();
        c.sound();
    }
}

abstract class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
    abstract void sound(); // Abstract method (does not have a body)
}
class Dog extends Animal {
    void sound() {
        System.out.println("The dog barks.");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("The cat meows.");
    }
}
