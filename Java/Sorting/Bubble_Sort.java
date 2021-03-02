package Sorting;

import java.util.Scanner;
public class Bubble_Sort {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Taking Input in Array
        for (int i = 0; i< n; i++){
            arr[i] = scanner.nextInt();
        }

        // Bubble Sort : Sorting Algorithm
        int counter = 1;
        while (counter < n){
            for (int j = 0; j < n-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
            counter++;
        }

        // Printing Sorted Array
        for (int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
