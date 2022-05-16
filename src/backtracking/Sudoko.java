package backtracking;
import java.util.ArrayList;

public class Sudoko {
    public static void main(String[] args) {
        char[][] board ={
        {'5','3','.','.','7','.','.','.','.'},
        {'6','.','.','1','9','5','.','.','.'},
        {'.','9','8','.','.','.','.','6','.'},
        {'8','.','.','.','6','.','.','.','3'},
        {'4','.','.','8','.','3','.','.','1'},
        {'7','.','.','.','2','.','.','.','6'},
        {'.','6','.','.','.','.','2','8','.'},
        {'.','.','.','4','1','9','.','.','5'},
        {'.','.','.','.','8','.','.','7','9'}};

        sudokuSolver(board);
    
       for(int i= 0;i<board.length;i++)
       {
           for(int j = 0;j<board[0].length;j++)
           {
               System.out.print(board[i][j]+", ");
            }
            System.out.println();
        }
    }

    private static boolean sudokuSolver(char[][] board) {
        //  we have to iterate each an every index
        for(int i =0;i<board.length;i++)
        {
            for(int j= 0;j<board[0].length;j++)
            {
                if(board[i][j] == '.') // '.' means empty()
                {
                    // if empty ,we will check 1 to 9 which numbers is not present of
                    // that index row , col and sub matrix
                    
                    for(char c = '1';c<='9';c++)
                    {
                        if(isValid(board,i,j,c))
                        {
                            board[i][j] = c;                            
                            if(sudokuSolver(board) == true)
                            {
                                return true;
                            }
                            else{
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValid(char[][] board,int row, int col, char c) {

        // here check 3 condition for index i,j 
        // we have to check char c is present or not 
        for(int i = 0;i<9;i++)
        {
            // check character in all rows
                if(board[i][col] == c){
                    return false;
                }
            // check character in all columns
                if(board[row][i] == c)
                {
                    return false;
                }
            // check character in sub-matrix
            if(board[3*(row/3) + row/3 ][3*(col/3) + col%3] == c)
            {
                return false;
            }
        }  
        return true;
    }
}
