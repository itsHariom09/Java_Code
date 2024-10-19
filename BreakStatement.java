public class BreakStatement {
    public static void main(String[] args) {
        /*
         * The break statement is used to terminate the execution of a loop or a switch case.
         */
        int i = 0;
        while (i <=5) {
            System.out.println("Inside the loop "+i);
            if (i == 3) {
                System.out.println("Breaking the loop "+i);
                break;
            }
            i++;
        }
    }
}
