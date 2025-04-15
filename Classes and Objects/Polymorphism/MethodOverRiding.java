package Polymorphism;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
public class MethodOverRiding {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound(); // Calls the overridden method in Dog class
        Animal a=new Animal();
        a.sound();
    }
}
