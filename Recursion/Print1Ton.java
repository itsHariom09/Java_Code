public class Print1Ton {
    public static void print1ToN(int n){
        if(n==0){
            return;
        }
        print1ToN(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        print1ToN(5);
    }
}
