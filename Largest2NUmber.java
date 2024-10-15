import java.util.*;
public class Largest2NUmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("Largest number is: " + a);
        } else {
                System.out.println("Largest number is: " + b);
        }

    }
}
