public class SubStringMethod {
    public static String subString(String str,int si,int ei) {
        String ans="";
        for(int i=si;i<ei;i++){
            ans+=str.charAt(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        String str="Hello Hariom";
        System.out.println(subString(str,0,6));
        //using inbuilt method
        System.out.println(str.substring(2,6));
        System.out.println(str.substring(2));
        
    }
    
}
