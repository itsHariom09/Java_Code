public class Constructors {
    public static void main(String[] args) {
        //Default Constructor or Non-Parameterized Constructor
        Student s1= new Student();
        s1.name="Hariom";
        s1.roll=111;
        s1.password="1234";

        //Parameterized Constructor
        Student s3 = new Student("Rahul", 222, "1234");
        System.out.println("Name: "+s3.name+" Roll: "+s3.roll+" Password: "+s3.password);
        //Non-Parameterized Constructor
        //Copy Constructor
        Student s2=new Student(s1);
        s2.password="2345";
        System.out.println("Name: "+s2.name+" Roll: "+s2.roll+" Password: "+s2.password);
        System.out.println("Name: "+s1.name+" Roll: "+s1.roll+" Password: "+s1.password);


    }
}

class Student{
    String name;
    int roll;
    String password;
    //Parameterized Constructor
    Student(String name, int roll, String password){
        this.name=name;
        this.roll=roll;
        this.password=password;
    }

    Student(Student s1){
        System.out.println("Copy Constructor Called");
        this.name=s1.name;
        this.roll=s1.roll;

    }

    Student(){
        System.out.println("Default Constructor Called");
    }
}
