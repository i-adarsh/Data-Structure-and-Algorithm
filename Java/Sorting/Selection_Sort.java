package Sorting;
/*
* Owner: Adarsh Kumar
* */
import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Taking input in Array

        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        // Selection Sort : Sorting Algorithm
        for (int i = 0; i < n-1; i++){
            for (int j = i+1; j < n; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        // Printing the Sorted Array
        for (int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }

        scanner.close();

    }
}
