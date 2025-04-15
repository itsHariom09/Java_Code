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
public class Singlelevel {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.color = "Black";
        d.eat();
        d.breath();
        d.bark();
        System.out.println("Dog color: " + d.color);
    }
}
