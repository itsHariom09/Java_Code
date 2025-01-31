public class OperatorsInJava {
    public static void main(String[] args) {
        /*
         * Arithmetic  Operators: 
            it is 2 types  of operators:
                1. Binary Operators: +, -, *, /, %
                2. Unary operators: ++, --
         
         * Relational  Operators: ==, !=, >, <, >=, <=
         * Logical   Operators: &&, ||, !
         * Assignment  Operators: =, +=, -=, *=, /=, %=, <<=, >>=, &=
         */

         //Arithmatic  Operators
         int a = 10;
         int b = 5;
         System.out.println("Binary: "+(a+b)+" "+(a-b)+" "+(a*b)+" "+(a/b)+" "+(a%b));
         System.out.println("Unary: "+("Post increment "+(a++) +" "+("Pre  increment "+ (++a))));
         System.out.println("Unary: "+("Post decrement "+(b--) +" "+("Pre  decrement "+(--b))));

    }
}
