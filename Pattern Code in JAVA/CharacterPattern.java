public class CharacterPattern {
    public static void main(String[] args) {
        /* print the following pattern
                    A
                    BC
                    DEF
                    GHIJ
         */
        char ch = 'A';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
