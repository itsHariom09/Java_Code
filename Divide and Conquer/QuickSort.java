public class QuickSort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void quicksort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pIdx=partition(arr,si,ei);
        quicksort(arr,si,pIdx-1);
        quicksort(arr,pIdx+1,ei);
    }

    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        System.out.println("Before sorting: ");
        printArr(arr);
        quicksort(arr, 0, arr.length-1);
        System.out.println("After sorting: ");
        printArr(arr);
        System.out.println("Time complexity: O(nlogn) in average case, O(n^2) in worst case");
        System.out.println("Space complexity: O(logn) in average case, O(n) in worst case");
        System.out.println("Stable sort: No");
        System.out.println("In-place sort: Yes");
        System.out.println("Best case: O(nlogn) when the pivot is always the median element");
        System.out.println("Worst case: O(n^2) when the pivot is always the smallest or largest element");
        System.out.println("Average case: O(nlogn) when the pivot is randomly chosen");
    }
}
