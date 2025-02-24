public class PrintLargestString {
    //using lexico-graphical comparison
    //It is a comparison of two strings in dictionary order

    public static void main(String[] args) {
        String str[]={"apple","mango","banana","grapes"};
        String largest=str[0];
        String largest1=str[0];
        for(int i=1;i<str.length;i++){
            if(str[i].compareTo(largest)>0){
                largest=str[i];
            }

            //OR
            if(largest1.compareTo(str[i])<0){
                largest1=str[i];
            }
        }
        System.out.println("Largest String is: "+largest);
        System.out.println("Largest String is: "+largest1);
    }
}
