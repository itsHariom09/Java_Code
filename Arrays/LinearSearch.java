import java.util.*;
public class LinearSearch {
    public static int linearSearch(int num[],int key) {
        for(int i=0;i< num.length;i++){
            if(num[i]==key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num[]={2,4,6,8,10,12,14,16,18};
        System.out.print("Enter Number You want to Search: ");
        int key= sc.nextInt();
        int index=linearSearch(num,key);
        if(index==-1){
            System.out.println("Number are not present");
        }
        else {
            System.out.println("Number position is "+index);
        }

    }
}
