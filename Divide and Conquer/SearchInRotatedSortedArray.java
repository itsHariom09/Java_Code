public class SearchInRotatedSortedArray {
    public static int search(int arr[],int target,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid= si+(ei-si)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[si]<=arr[mid]){
            if(arr[si]<=target && target<=arr[mid]){
                return search(arr,target,si,mid-1);
            }
            else{
                return search(arr,target,mid+1,ei);
            }
        }else{
            if(arr[mid]<=target && target<=arr[ei]){
                return search(arr,target,mid+1,ei);
            }else{
                return search(arr,target,si,mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        int result=search(arr,target,0,arr.length-1);
        if(result==-1){
            System.out.println("Element not found in the array");
        }else{
            System.out.println("Element found at index: " + result);
        }

        System.out.println("-------------------*-------------------------*--------------------------------");
        System.out.println("Time complexity: O(logn)");
        System.out.println("Space complexity: O(1)");
        System.out.println("Best case: O(1) when the target is at the mid index");
        System.out.println("Worst case: O(logn) when the array is rotated and the target is at the end of the array");
        System.out.println("Average case: O(logn) when the array is rotated and the target is randomly chosen");
        System.out.println("Stable sort: No");
        System.out.println("In-place sort: Yes");

    }
}
