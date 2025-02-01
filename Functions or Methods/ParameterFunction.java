import java.util.*;
public class ParameterFunction {
    public static int add(int a,int b){//parameters or formal parameters
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b=sc.nextInt();
        System.out.println("Sum of "+a+" and "+b+" is "+add(a,b));//arguments or actual parameters
    }
}
