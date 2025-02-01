public class FunctionOverloadingUsingParameters {
    //Sun of two integers
    public static int add(int a,int b){
        return a+b;
    }
    //Sum of three integers
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println("Sum of two integers: "+add(50,40));
        System.out.println("Sum of three integer: "+add(50,40,20));
    }
}
