import java.util.*;

public class ArrayCC {
    public static void main(String[] args) {
        int num[]=new int[10];
        num[0]=99;
        num[1]=65;
        num[2]=54;
        System.out.println("Num 1:"+num[0]);
        System.out.println("Num 2:"+num[1]);
        System.out.println("Num 3:"+num[2]);
        //Update Array
        num[1]=76;
        System.out.println("Updated Num 2:"+num[1]);
        //Print Length
        System.out.println("Length of Array:"+num.length);

    }
}
