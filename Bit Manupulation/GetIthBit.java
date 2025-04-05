public class GetIthBit {
    public static int getIthBit(int n,int i){
        int bit=1<<i;
        if((n&bit)==0){
            return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(getIthBit(5,2)); // 1
    }
    
}
