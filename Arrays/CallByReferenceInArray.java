public class CallByReferenceInArray {
    public static void update(int marks[]) {
        for (int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={76,65,87};
        update(marks);
        //Call By Reference
        for (int i=0;i<marks.length;i++){
            System.out.println("Marks "+(i+1)+" : "+marks[i]);
        }

    }
}
