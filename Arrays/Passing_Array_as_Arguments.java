
public class Passing_Array_as_Arguments {
    public static void update(int marks[]){
        for (int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
            System.out.println("Marks"+(i+1)+" : "+marks[i]);
        }
    }
    public static void main(String[] args) {
        int marks[]={65,76,98};
        update(marks);
    }
}
