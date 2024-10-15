public class TypePromotinInExpression {
    public static void main(String[] args) {
        /*
         * 1. Java automatically promotes each type byte,short, or char operand to int when evaluating an expression.
         * 2. If one operand is long,float or double the whole expression is promoted to long,float or double respectively.
         */
        char a='a';//97 in int
        int b=10;
        System.out.println(a+b);//107

        int x=20;
        float y=10.45f;
        long z=23;
        double s=a+y+z;
        System.out.println(s);//result in double
    }
}
