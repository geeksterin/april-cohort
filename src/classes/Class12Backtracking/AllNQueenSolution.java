package classes.Class12Backtracking;

import static classes.Class12Backtracking.NQueenProblem.canPlaceTheQueen;
import static classes.Class12Backtracking.NQueenProblem.printBoard;

public class AllNQueenSolution {

    public static void nQueen2(int[][] board,int row){
        // base case
        if (board.length == row){
            printBoard(board);
            System.out.println("------------------------------------------------------");
            System.out.println("------------------------------------------------------");
        }

        // main logic
        for (int col = 0; col < board.length; col++) {
            if(canPlaceTheQueen(board,row,col)) {
                board[row][col] = 1;
                nQueen2(board, row + 1);
                board[row][col] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int n = 8;
        int[][] board = new int[n][n];
        nQueen2(board,0);
    }

}
