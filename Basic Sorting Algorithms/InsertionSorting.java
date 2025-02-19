public class InsertionSorting {
    public static void insertionSort(int arr[]) {
        for(int i=1;i<arr.length;i++){
            int currElement=arr[i];
            int prevElement=i-1;
            //Findint the correct position to insert
            while(prevElement>=0 && arr[prevElement]>currElement){
                arr[prevElement+1]=arr[prevElement];
                prevElement--;
            }
            //Insertion
            arr[prevElement+1]=currElement;
        }
    }
    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }  
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        insertionSort(arr);
        printArray(arr);

    }
}
