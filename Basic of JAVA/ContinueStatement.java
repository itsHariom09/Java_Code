public class ContinueStatement {
    public static void main(String[] args) {
        //  Continue statement is used to skip the execution of the current iteration of a loop and move to the next
        for(int i=0;i<10;i++){
            if(i==3){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
