package Recursion;

import java.util.Scanner;

public class NQueens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] chess = new int [n][n];
        printNQueens(chess, "", 0);
        sc.close();

    }

    public static void printNQueens(int [][] chess, String qsf, int row){
        if (row == chess.length){
            System.out.println(qsf);
            return;
        }
        // qsf -> Queen So Far
        for (int col = 0; col < chess.length; col++){
            if (isQueenIsSafeToPlace(chess, row, col) == true){
                chess[row][col] = 1;
                printNQueens(chess, qsf + row + "-" + col + ", ", row + 1);
                chess[row][col] = 0;
            }
        }
    }

    public static boolean isQueenIsSafeToPlace(int [][] chess, int row, int col){
        for (int i = row - 1, j = col; i >= 0; i--){
            if (chess[i][j] == 1){
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if (chess[i][j] == 1){
                return false;
            }
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++){
            if (chess[i][j] == 1){
                return false;
            }
        }

        return true;
    }
    
}
