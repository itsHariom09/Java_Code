class Animal{
    String color;
    void eat(){
        System.out.println("Eating...");
    }
    void breath(){
        System.out.println("Breathing...");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("Walking...");
    }
}
class Dog extends Mammal{
    void bark(){
        System.out.println("Barking...");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.color="Black";
        d.walk();
        d.eat();
        d.breath();
        // d.walk();
        d.bark();
        System.out.println("Dog color: "+d.color);
    }
}
