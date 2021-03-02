package Array_2D;

import java.util.Scanner;

/*
NOTE:

For Sorted Rows and Column

*/

public class Matrix_Search {
    public static void main(String [] args){
        Scanner kb = new Scanner(System.in);
        int n1 = kb.nextInt();
        int n2 = kb.nextInt();
        int k = kb.nextInt();
        int[][] arr = new int[n1][n2];
        for (int i = 0; i < n1; i++){
            for (int j = 0; j < n2; j++){
                arr[i][j] = kb.nextInt();
            }
        }
        // Searching Algorithm
        int r = 0, c = n2-1;
        boolean found = false;
        while(r < n1 && c >=0 ){
            if (arr[r][c] == k){
                found = true;
                break;
            }
            else if(arr[r][c] > k){
                c--;
            }
            else {
                r++;
            }
        }
        if (found){
            System.out.println("Element Present");
        }
        else {
            System.out.println("Element Doesn't exist");
        }
    }
}

/*
input

3 3 9
1 2 3
4 5 6
7 8 9

output

Element Present
*/