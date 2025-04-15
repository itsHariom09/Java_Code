public class StaticKeyword {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.college="NIET";
        s1.setName("Hariom");
        s1.getName();
        System.out.println("College: " + s1.college);
        Student1 s2 = new Student1();
        s2.college="IIT";
        s2.setName("Hariom");
        s2.getName();
        System.out.println("College: " + s2.college);
    }
}
class Student1{
    String name;
    int roll;
    static String college;
    void setName(String name){
        this.name = name;
    }
    void getName(){
        System.out.println("Name: " + name);
    }
}
