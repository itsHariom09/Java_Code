import java.util.*;
public class PrintSumOfEvenAndOddInSetOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evennum=0,oddnum=0,choice;
        do{
            System.out.print("Enter the number: ");
            int number=sc.nextInt();
            if(number%2==0){
                evennum+=number;
            }
            else{
                oddnum+=number;
            }
            System.out.print("Do you want to Ccontinue? press 1 for yes or 0  for no: ");
            choice=sc.nextInt();

        }while(choice==1);
        System.out.println("Sum of  even numbers: "+evennum);
        System.out.println("Sum  of odd numbers: "+oddnum);
    }
}
