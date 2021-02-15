import java.util.Scanner;

public class Insertion_Sort {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        // Taking Input in Array
        for (int i = 0; i < n ; i++){
            arr[i] = scanner.nextInt();
        }

        // Insertion Sort : Sorting Algorithm
        for (int i = 1; i < n; i++){
            int current = arr[i];
            int j = i - 1;
            while (j>=0 && arr[j] > current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }

        // Printing Sorted Array
        for (int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
