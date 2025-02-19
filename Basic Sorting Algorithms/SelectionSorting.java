import java.util.*;
public class SelectionSorting {
    public static void selectionSort(int arr[]) {
        for(int i=0;i<arr.length;i++){
            int minElse=i;
            for(int j=i+1;j<arr.length;j++){
                //Increasing Order
                // if(arr[minElse]>arr[j]){
                //     minElse=j;
                // }
                //Decreasing Order
                if(arr[minElse]<arr[j]){
                    minElse=j;
                }
            }
            //Swap
            int temp=arr[minElse];
            arr[minElse]=arr[i];
            arr[i]=temp;

        }
    }
    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        selectionSort(arr);
        printArray(arr);

    }
}
