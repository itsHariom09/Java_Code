public class BinomialCoefficient {
    /* formula of binomial coefficient:-
    C(n, r) = n! / (r! * (n - r)!)
     */

     public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
     }

     public static int binomialCoeff(int n,int r){
        int a=fact(n);
        int b=fact(r);
        int c=fact(n-r);
        int bc=a/(b*c);
        return bc;
     }

     public static void main(String[] args) {
        int n=5;
        int r=2;
        System.out.println("Binomial Coefficient of "+n+" and "+r+" is "+binomialCoeff(n,r));
     }
}
