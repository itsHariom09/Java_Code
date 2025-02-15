import java.util.*;
public class MaxSubarraySum {
    //Broute force approach
    public static void MaxSubarraySum(int arr[]) {
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                currentSum=0;
                for (int k=i;k<=j;k++){
                    currentSum+=arr[k];
                }
                if(maxSum<currentSum) {
                    maxSum = currentSum;
                }
            }
            System.out.println();
        }
        System.out.println("Max Sum: "+maxSum);

    }
    public static void main(String[] args) {
        int[] arr = {1, -2,6,-1,3};
        MaxSubarraySum(arr);
    }
}
