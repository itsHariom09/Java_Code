public class PrintNumber1To10 {
    public static void main(String[] args) {
        //Using for loop

        for (int i = 1; i <= 10; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        //Using while loop

        int a =1;
        while (a<=10) {
            System.out.print(a+" ");
            a++;
        }
        System.out.println();

        //Using do-while loop

        int b=1;
        do{
            System.out.print(b+" ");
            b++;
        }while(b<=10);
    }
    
}
