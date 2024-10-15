import java.util.*;
public class AreaOFCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of Circle: ");
        double r=sc.nextDouble();
        double area = 3.14*r*r;
        System.out.println("Area of Circle is: "+area);
    }
}
