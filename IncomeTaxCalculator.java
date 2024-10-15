import java.util.*;
public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Salary: ");
        int salary=sc.nextInt();
        if(salary<500000){
            System.out.println("No Tax");
        }else if (salary>=500000 && salary<=1000000) {
            System.out.println("Tax: "+(salary*0.2));
        }else{
            System.out.println("Tax: "+(salary*0.3));
        }
    }
}
