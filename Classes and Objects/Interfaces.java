public class Interfaces {
    public static void main(String[] args) {
        Cat2 c=new Cat2();
        Dog2 d=new Dog2();
        Cow cow=new Cow();
        c.eat();
        d.eat();
        cow.eat();
    }

}
interface Animal2{
    void eat();
}
class Dog2 implements Animal2{
    public void eat(){
        System.out.println("Dog eats meat");
    }
}
class Cat2 implements Animal2{
    public void eat(){
        System.out.println("Cat eats fish");
    }
}
class Cow implements Animal2{
    public void eat(){
        System.out.println("Cow eats grass");
    }
}
