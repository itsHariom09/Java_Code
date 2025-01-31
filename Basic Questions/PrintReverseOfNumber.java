public class PrintReverseOfNumber {
    public static void main(String[] args) {
        int number = 12345;
        while (number>0) {
            int lastdigit=number%10;
            System.out.print(lastdigit);
            number=number/10;
        }
    }
}
