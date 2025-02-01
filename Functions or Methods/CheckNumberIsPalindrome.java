public class CheckNumberIsPalindrome {
    public static boolean isPalindrome(int n){
        int t=n;
        int r=0;
        while(n>0){
            r=r*10+n%10;
            n=n/10;
        }
        return t==r;
    }
    public static void main(String[] args) {
        int n=121;
        if(isPalindrome(n)){
            System.out.println(n+" is a palindrome number");
        }else{
            System.out.println(n+" is not a palindrome number");
        }
    }
    
}
