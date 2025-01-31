import java.util.*;
public class SumOfTwoNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second Number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of two number is: "+sum);
    }
}