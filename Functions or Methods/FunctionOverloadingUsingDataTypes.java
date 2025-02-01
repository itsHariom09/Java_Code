public class FunctionOverloadingUsingDataTypes {
    // Function with 2 integer parameters
    public static void add(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }
    // Function with 2 double parameters
    public static void add(double a, double b) {
        System.out.println("Sum of two doubles: " + (a + b));
    }
    // Function with 2 float parameters
    public static void add(float a, float b) {
        System.out.println("Sum of two floats: " + (a + b));
    }

    public static void main(String[] args) {
        add(10, 20);
        add(10.5, 20.5);
        add(15.5f, 20.5f);
    }
    
}
