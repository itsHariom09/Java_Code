public class ConvertBinaryToDecimal {
    public static void convertBianryToDecimal(int binNum){
        int pow=0;
        int dec=0;
        while(binNum>0){
            int lastnum=binNum%10;
            dec=dec+(lastnum*(int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("Decimal number is: "+dec);
    }
    public static void main(String[] args) {
        convertBianryToDecimal(101);
    }
}
