public class PrintStarPattern1 {
    public static void main(String[] args) {
        /* print the following pattern
                    * 
                    * *
                    * * *
                    * * * *
         */
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
