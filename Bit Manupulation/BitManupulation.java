public class BitManupulation {
        public static void main(String[] args) {
            int a=5,b=6;
            //Bitwise AND
            System.out.println(a&b);
            //Bitwise OR
            System.out.println(a|b);
            //Bitwise XOR
            System.out.println(a^b); 
            //Bitwise NOT
            System.out.println(~a); 
            //Left Shift
            System.out.println(a<<1); 
            //Right Shift
            System.out.println(a>>1); 
            //Unsigned Right Shift
            System.out.println(a>>>1); 
            //Clear bit at position 2
            System.out.println(a&(~(1<<2))); 
            //Set bit at position 2
            System.out.println(a|(1<<2)); 
            //Toggle bit at position 2
            System.out.println(a^(1<<2)); 
            //Check if last bit is set
            System.out.println((a&1)==1); 
            //Check if last bit is not set
            System.out.println((a&1)==0); 
            //Check if odd or even
            System.out.println((a&1)==1 ? "Odd" : "Even"); 
            //Check if even or odd
            System.out.println((a&1)==0 ? "Even" : "Odd"); 
        }    
}
