public class SumOf1stNNumber {
    public static int firstSum(int n){
        if(n==1){
            return 1;
        }
        return n+firstSum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(firstSum(6));
    }
}
