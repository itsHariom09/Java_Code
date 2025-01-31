import java.util.*;
public class TypeConversion {
    public static void main(String[] args) {
        /* Type conversion happen when
         * type compatible
         * destination > source type
         *  Byte -> Short ->  Integer -> Long -> Float -> Double
         * Example:- int a=10; long b=a; //It will execute
         * Example:- long a=10; int b=a; //It will show error because 
           int is not able to hold long value
           long have 8 byte and  int have 4 byte so,data loss  will occur
         * This conversion is calles lossy conversion.
         */
        int a=10;
        long b=a;
        System.out.println(b);

        // long  c=10;
        // int d=c;
        // System.out.println(d);

    }
}
