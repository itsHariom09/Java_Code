public class InvertedStarPattern {
    public static void main(String[] args) {
        /* print the following pattern 
                    * * * *
                    * * *
                    * *
                    * 
        */

        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
