public class IsEqualMethod {
    public static void main(String[] args) {
        String str1 = "Hello"; //Creating a new object of string
        String str2 = "Hello"; //Pointed to str1 object of string not created a new object
        String str3 = new String("Hello"); //Creating a new object of string
        if(str1==str2){
            System.out.println("str1 and str2 are equal");
        }else{
            System.out.println("str1 and str2 are not equal");
        }

        if(str1==str3){
            System.out.println("str1 and str3 are equal");
        }else{
            System.out.println("str1 and str3 are not equal");
        }

        //Use isEqual method to compare the content of the strings
        if(str1.equals(str3)){
            System.out.println("str1 and str3 are equal");

        }else{
            System.out.println("str1 and str3 are not equal");
        }
    }
}
