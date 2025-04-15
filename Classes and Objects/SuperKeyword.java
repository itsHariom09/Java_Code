public class SuperKeyword {
    public static void main(String[] args) {
        std1 s1 = new std1();
        s1.name = "Hariom";
        System.out.println("Name: " + s1.name);
    }
}

class Std{
    String name;
    Std(){
        System.out.println("Default constructor of Std class");
    }
}
class std1 extends Std{
    std1(){
        super();
        System.out.println("Default constructor of std1 class");
    }
}