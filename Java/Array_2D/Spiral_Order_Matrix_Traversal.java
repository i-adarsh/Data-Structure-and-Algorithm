package Array_2D;

import java.util.Scanner;
public class Spiral_Order_Matrix_Traversal {
    public static void main(String [] args){
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[][] arr = new int[n][m];
        // Taking Input in 2D Array
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                arr[i][j] = kb.nextInt();
            }
        }

        int row_start = 0, row_end = n-1, col_start = 0, col_end = m-1;
        while(row_start <= row_end && col_start <= col_end){

            // for row_start
            for (int col = col_start; col <= col_end; col++){
                System.out.print(arr[row_start][col] + " ");
            }
            row_start+=1;
            // for column end
            for(int row = row_start; row <= row_end; row++){
                System.out.print(arr[row][col_end] + " ");
            }
            col_end-=1;
            // for row_end
            for(int col = col_end; col >= col_start; col--){
                System.out.print(arr[row_end][col] + " ");
            }
            row_end-=1;
            // for col_start
            for(int row = row_end; row >= row_start; row--){
                System.out.print(arr[row][col_start] + " ");
            }
            col_start+=1;
        }
    }
}
