package classes.Class12Backtracking;

public class Sudoku {


    public static void main(String[] args) {

        int[][] grid = { {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0} };

        SudokuSolver(grid,0,0);
    }

    private static boolean SudokuSolver(int[][] grid, int row, int col) {
        // base case
        if (col >8){
            return SudokuSolver(grid,row+1,0);
        }
        if(row > 8){
            for (int i = 0;i< grid.length;i++){
                for (int j = 0; j < grid.length; j++) {
                    System.out.print(grid[i][j] + " " );
                }
                System.out.println();
            }
            return true;
        }

        // if number is already there
        if (grid[row][col] != 0){
            return SudokuSolver(grid,row,col+1);
        }
        else{
            for (int i = 1; i <= 9; i++) {
                if(canPlace(grid,row,col,i)){
                    grid[row][col] = i;
                    if(SudokuSolver(grid,row,col+1)){
                        return true;
                    }
                    else {
                        grid[row][col] = 0;
                    }
                }
            }

        }
        return false;
    }

    private static boolean canPlace(int[][] grid, int row, int col, int i) {
        for (int j = 0; j <= 8; j++) {
            if(grid[row][j] == i){
                return false;
            }
        }

        for (int j = 0; j <= 8; j++) {
            if(grid[j][col] == i){
                return false;
            }
        }

        int sr = (row/3)*3;
        int sc = (col/3)*3;

        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                if(grid[sr+j][sc+k] == i){
                    return false;
                }
            }
        }
        return true;
    }

}
