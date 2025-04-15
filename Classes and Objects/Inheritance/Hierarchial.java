class Animal{
    String color;
    void eat(){
        System.out.println("Eating...");
    }
    void breath(){
        System.out.println("Breathing...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking...");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("Meowing...");
    }
}
public class Hierarchial {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.color = "Black";
        d.eat();
        d.breath();
        d.bark();
        System.out.println("Dog color: " + d.color);
        Cat c = new Cat();
        c.color = "White";
        c.eat();
        c.breath();
        c.meow();
        System.out.println("Cat color: " + c.color);
    }
}
