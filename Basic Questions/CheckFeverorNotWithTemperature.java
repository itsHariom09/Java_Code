import java.util.*;
public class CheckFeverorNotWithTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your temperature in Fahrenheit: ");
        double  temperature = sc.nextDouble();
        if (temperature >= 100.4) {
            System.out.println("You have a fever");
        }else{
            System.out.println("You don't have a fever");
        }
    }
}
