import java.util.Scanner;

public class Printing_All_Subarray {
    public static void main(String [] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        // Taking Input in Array
        for (int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        // Printing All the Subarray
        for (int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
