import java.util.*;
public class DisplayAllNumberEnterByUserExceptMultipleOf10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter a number");
            int num = sc.nextInt();
            if(num % 10 == 0){
                continue;
            }
            System.out.println(num);
        }while(true);
    }
}
