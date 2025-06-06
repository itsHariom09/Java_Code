public class FindLastOccurence {
    public static int lastOccurence(int[] arr,int target,int i){
        if(i==arr.length){
            return -1;
        }
        int idx=lastOccurence(arr, target, i+1);
        if(idx!=-1){
            return idx;
        }
        if(arr[i]==target){
            return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,5,4,5,6,7,8,9,10};
        int target=5;
        int result=lastOccurence(arr,target,0);
        if(result==-1){
            System.out.println("Element not found in the array.");
        }else{
            System.out.println("Element found at index: " + result);
        }
    }
}
