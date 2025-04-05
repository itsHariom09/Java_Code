public class SetIthBit {
    public static int setIthBIT(int n,int i){
        int bit=1<<i;
        return n|bit;
    }
    public static void main(String[] args) {
        System.out.println(setIthBIT(5,2)); 
    }
}
