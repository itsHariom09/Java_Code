import java.util.Scanner;
public class TwodArrays {
    public static boolean searchElement(int matrix[][],int k) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==k){
                    System.out.println("Element found at "+"Row no. "+i+" "+"Col no. "+j);
                    return true;
                }
            }
        }
        System.out.println("Element not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int n=3,m=3;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        //Search
        int ser=6;
        int[][] mex={{1,2,3},
        {4,5, 6},
        {7 ,8, 9 }};
        searchElement(mex, ser);
    }
}

