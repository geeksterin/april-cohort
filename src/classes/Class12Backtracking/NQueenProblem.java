package classes.Class12Backtracking;

public class NQueenProblem {


    public static boolean nQueen(int[][] board,int row){
        // base case
        if (board.length == row){
            printBoard(board);
            return true;
        }

        // main logic
        for (int col = 0; col < board.length; col++) {
            if(canPlaceTheQueen(board,row,col)){
                board[row][col] = 1;
                if(nQueen(board,row+1)){
                    return true;
                }
                else{
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    private static void printBoard(int[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static boolean canPlaceTheQueen(int[][] board, int row, int col) {
        // queen in col or not
        for (int i = 0;i<board.length;i++){
            if(board[i][col] == 1){
                return false;
            }
        }

        //first diagonal
        int i = row;
        int j = col;
        while (i >= 0 && j>=0){
            if(board[i][j] == 1){
                return false;
            }
            i--;
            j--;

        }

        // second diagonal
        i = row;
        j = col;
        while (i>=0 && j<board.length){
            if (board[i][j] == 1){
                return false;
            }
            i--;
            j++;
        }
        return true;
    }


    public static void main(String[] args) {
        int n = 8;
        int[][] board = new int[n][n];
        nQueen(board,0);
    }

}
