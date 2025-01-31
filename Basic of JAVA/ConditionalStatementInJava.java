public class ConditionalStatementInJava {
    public static void main(String[] args) {
        /*
         * if-else statement:
                Syntex: 
                if (condition){
                }else{
                }


         * else if statement:
                Syntex:
                if(condition){
                }else if(condition){
                }else{
                }

         * Ternary  operator:
                Syntex:
                variable = condition? statement1 :  statement2;
            
         * Switch  statement:
                syntex:
                switch(expression){
                case value1:
                case value2:
                case value3:
                default:
                }
         */

         int a=10;
         int b=20;
         int c=15;
         if(a>b && a>c){
            System.out.println("a is greater");
         }else if (b>a && b>c) {
            System.out.println("b is greater");
         }else{
            System.out.println("c is greater");
         }



         //ternary  operator
         int max = (a>b && a>c)? a:(b>a && b>c)? b:c;
         System.out.println("max is "+max);

    }
}
