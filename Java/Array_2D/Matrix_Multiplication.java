package Array_2D;

import java.util.Scanner;

public class Matrix_Multiplication {
    public static void main(String [] args){
        Scanner kb = new Scanner(System.in);
        int n1 = kb.nextInt();
        int n2 = kb.nextInt();
        int n3 = kb.nextInt();

        int[][] m1 = new int[n1][n2];
        int[][] m2 = new int[n2][n3];
        // Input of First Matrix
        for(int i = 0; i < n1; i++){
            for(int j = 0; j < n2; j++){
                m1[i][j] = kb.nextInt();
            }
        }
        // Input of Second Matrix
        for (int i = 0; i < n2; i++){
            for (int j = 0; j < n3; j++){
                m2[i][j] = kb.nextInt();
            }
        }

        // Matrix Multiplication

        int[][] ans = new int[n1][n3];

        for (int i = 0; i < n1; i++){
            for (int j = 0; j < n3; j++){
                for (int k = 0; k < n2; k++){
                    ans[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        for(int i = 0; i < n1; i++){
            for(int j = 0; j < n3; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}

/*
input

3 4 3
2 4 1 2
8 4 3 6
1 7 9 5
1 2 3
4 5 6
7 8 9
4 5 6

output

33 42 51
69 90 111
112 134 156
*/