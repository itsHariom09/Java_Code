/*
 * Loops in java:
    -> for loop 
        syntex:  for (initialization; condition; increment/decrement) {
        }
    
    -> while loop
        syntex: while (condition) {
        }
    
    ->  do-while loop
        syntex:  do {
        }while(condition);

 */

// FOR LOOP :-
public class LoopinJava {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        int a=0;
        while (a<=3) {
            System.out.print(a+" ");
            a++;
        }
        System.out.println();
        do{
            System.out.print("Hello ");
            a++;
        }while(a<4);
    }
}