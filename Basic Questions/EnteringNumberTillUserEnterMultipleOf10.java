import java.util.Scanner;
public class EnteringNumberTillUserEnterMultipleOf10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Enter a number: ");
            int a=sc.nextInt();
            if(a%10==0){
                break;
            }
            System.out.println(a);
        }while(true);
    }
}
