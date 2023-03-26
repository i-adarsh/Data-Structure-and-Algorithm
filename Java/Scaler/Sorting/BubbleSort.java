package Scaler.Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {3, -1, 6, 9, 4, 2, 5, 4};
        bubbleSort(arr);
    }
    public static void bubbleSort(int [] arr){
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        print(arr);
    }
    public static void print(int [] arr){
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
