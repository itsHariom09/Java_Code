import java.util.Scanner;
class Stringss {

    public static void main(String[] args) {
        String str="Hariom";
        //Print the string
        System.out.println(str);
        //Print the length of the string
        System.out.println("Length of String is: "+str.length());
        
        String str1="111";
        //Concatenation of two strings
        String str2=str+" "+str1;
        System.out.println(str2);

        //print the character
        for(int i=0;i<str2.length();i++){
            System.out.print(str2.charAt(i)+" ");
        }

    }
}