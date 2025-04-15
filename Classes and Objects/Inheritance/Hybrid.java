class Animal {

    void eat() {
        System.out.println("Animal eats");
    }
}
class Mammal extends Animal {

    void walk() {
        System.out.println("Mammal walks");
    }
}
class Bird extends Animal {

    void fly() {
        System.out.println("Bird flies");
    }
}
class Bat extends Bird {

    void flyn() {
        System.out.println("Bat flies");
    }
}
public class Hybrid {
    public static void main(String[] args) {
        Bat b = new Bat();
        b.eat(); 
        b.fly();
        b.flyn();
        Mammal m = new Mammal();
        m.eat();
        m.walk();
        Bird br = new Bird();
        br.eat();
        br.fly();
    }
}
