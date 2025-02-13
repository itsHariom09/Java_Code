public class PrintSubarrays {
    public static void printSubarrays(int arr[]){
        for (int i=0;i< arr.length;i++){
            int start=i;
            for (int j=i;j< arr.length;j++){
                int end=j;
                System.out.print("[");
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.print("]");
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        printSubarrays(arr);
    }
}
