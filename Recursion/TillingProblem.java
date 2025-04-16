public class TillingProblem {
    public static int tillingProblem(int n) {
        if(n<=1){
            return 1;
        }
        int fnm1=tillingProblem(n-1);
        int fnm2=tillingProblem(n-2);
        return fnm1 + fnm2;
    }
    public static void main(String[] args) {
        int n = 3; 
        System.out.println("Number of ways to tile a " + n + "x1 board: " + tillingProblem(n));
    }
}
