public class UpdateIthBit {
    public static int setIthBIT(int n,int i){
        int bit=i<<i;
        return n|bit;
    }
    public static int clearIthBit(int n,int i){
        int bit=~(1<<i);
        return n&bit;
    }
    public static int updateIthBit(int n,int i,int bit){
        // if(bit==1){
        //     return setIthBIT(n,i);
        // }else{
        //     return clearIthBit(n,i);
        // }



        n=clearIthBit(n,i);
        int bitMask=bit<<i;
        return n|bitMask;
        
    }
    public static void main(String[] args) {
        System.out.println(updateIthBit(10,2,1)); 
    }
    
}
