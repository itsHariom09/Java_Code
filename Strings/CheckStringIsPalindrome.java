import java.util.Scanner;
public class CheckStringIsPalindrome {
    public static boolean isPalindrome(String s) {
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to check if it is palindrome or not: ");
        String s = sc.nextLine();
        if(isPalindrome(s)){
            System.out.println("The string is palindrome");
        }else{
            System.out.println("The string is not palindrome");
        }
        
    }
}
