public class ClearLastIthBit {
    public static int clearLastIthBit(int n,int i){
        int bit=~(0)<<i;
        return n&bit;
    }
    public static void main(String[] args) {
        System.out.println(clearLastIthBit(15,2)); 
    }
    
}
