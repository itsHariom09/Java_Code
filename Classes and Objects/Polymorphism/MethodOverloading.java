package Polymorphism;
public class MethodOverloading {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        System.out.println(c.sum(10, 20)); // Calls the first method (int, int)
        System.out.println(c.sum(10.5, 20.5)); // Calls the second
        System.out.println(c.sum(10, 20, 30)); // Calls the third method (int, int, int)
        System.out.println(c.sum(10.5, 20)); // Calls the first method (double, int)
        System.out.println(c.sum(10, 20.5)); // Calls the first method (int, double)
        
    }
}
class Calculator{
    int sum(int a, int b){
        return a + b;
    }
    double sum(double a, double b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }
}
