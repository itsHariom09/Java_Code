public class ClearIthBit {
    public static int clearIthBit(int n,int i){
        int bit=~(1<<i);
        return n&bit;
    }
    public static void main(String[] args) {
        System.out.println(clearIthBit(10,1));
    }
}
