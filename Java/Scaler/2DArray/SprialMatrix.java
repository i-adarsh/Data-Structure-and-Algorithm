import java.util.Scanner;

class SprialMatrix{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] matrix = new int[n][n];
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        int count = 1;

        // while(left <= right && top <= bottom){

        //     for (int i = left; i <= right; i++){
        //         matrix[top][i] = count++;
        //     }
        //     top++;
        //     for (int i = top; i <= bottom; i++){
        //         matrix[i][bottom] = count++;
        //     }
        //     right--;
        //     for (int i = right; i >= left; i--){
        //         matrix[bottom][i] = count++;
        //     }
        //     bottom--;
        //     for (int i = bottom; i >= top; i--){
        //         matrix[i][left] = count++;
        //     }
        //     left++;
        //     // System.out.println(left + " " + right + " " + top + " " + bottom);
        // }

        while (left <= right && top <= bottom){
            for (int i = left; i <= right; i++){
                matrix[top][i] = count++;
            }
            top++;
            for (int i = top; i <= bottom; i++){
                matrix[i][bottom] = count++;
            }
            right--;
            for (int i = right; i >= left; i--){
                matrix[bottom][i] = count++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--){
                matrix[i][left] = count++;
            }
            left++;
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}