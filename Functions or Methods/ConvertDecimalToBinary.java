public class ConvertDecimalToBinary {
    public static void decimalToBinary(int n){
        int pow=0;
        int binary=0;
        while(n>0){
            int lastnum=n%2;
            binary=binary+lastnum*(int)Math.pow(10,pow);
            n=n/2;
            pow++;
        }
        System.out.println(binary);
    }
    public static void main(String[] args) {
        decimalToBinary(11);
    }
}
