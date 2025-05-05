public class NQueen_AllWays {
    public static boolean isSafe(char board[][],int row,int col){
        // Vertical Up Check
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //Diagonal Left Up Check
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //Diagonal Right Up Check
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static void nQueen(char board[][],int row){
        if(row==board.length){
            printBoard(board);
            return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board, row, j)){
                board[row][j]='Q'; // Place Queen
                nQueen(board, row+1); // Recur to place rest of the queens
                board[row][j]='X'; // Backtrack and remove queen
            }
        }
    }
    public static void printBoard(char board[][]){
        System.out.println("-------------Chess Board-------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");
    }
    public static void main(String[] args) {
        int n=4; // Size of the chess board
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X'; // Initialize the board with 'X'
            }
        }
        nQueen(board, 0); // Start placing queens from the first row
    }
}
