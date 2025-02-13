public class FindLargestNumber {
    public static int largestNumber(int num[]) {
        int val=0;
        for (int i=0;i<num.length;i++){
            if(val<=num[i]){
                val=num[i];
            }
        }
        return val;
    }
    public static void main(String[] args) {
        int num[]={3,2,25,6,9,7,10,1};

        System.out.println(largestNumber(num));
    }
}
