import java.util.*;
public class MaxSubarraySum {
    //Broute force approach
    public static void MaxSubarraySum(int arr[]) {
        int currSum=0;
        int maxSum=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
            for(int j=i;j<arr.length;j++) {
                currSum=0;
                for(int k=i;k<=j;k++) {
                    currSum+=arr[k];
                }
                maxSum=Math.max(maxSum,currSum);
            }
        }
        System.out.println(maxSum);

    }
    public static void main(String[] args) {
        int[] arr = {1, -2,6,-1,3};
        MaxSubarraySum(arr);
    }
}
