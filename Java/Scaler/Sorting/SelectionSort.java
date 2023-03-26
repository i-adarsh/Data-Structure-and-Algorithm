package Scaler.Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {2,8,4,-1,6,7,5};
        selectionSort(arr);
    }   
    
    public static void selectionSort(int [] arr){
        for (int i = 0; i < arr.length - 1; i++){
            int index = i;
            for (int j = i; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
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

