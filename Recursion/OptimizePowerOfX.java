public class OptimizePowerOfX {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }
        int half=power(x,n/2);
        int halfSquare=half*half;
        if(n%2!=0){
            return halfSquare*x;
        }
        return halfSquare;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int result = power(x, n);
        System.out.println(x + " raised to the power of " + n + " is: " + result);
    }
}
