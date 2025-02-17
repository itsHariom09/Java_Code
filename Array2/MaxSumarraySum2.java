import java.util.*;
public class MaxSumarraySum2 {
    //Kadane's Algorithms
    public static void kadanes(int arr[]) {
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<arr.length;i++){
            currSum=currSum+arr[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(currSum,maxSum);
        }
        System.out.println("MAXIMUM SUBARRAY SUM IS: "+maxSum);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        kadanes(arr);

    }
}

