package Recursion;

public class SearchFirstAndLastOccurrence {
    public static int SearchFirstOccurrence(int [] arr, int n, int i, int key){
        if (i == n){
            return -1;
        }
        if (arr[i] == key){
            return i;
        }
        return SearchFirstOccurrence(arr, n, i+1, key);
    }

    public static int SearchLastOccurrence(int [] arr, int n, int i, int key){
        if (i == n){
            return -1;
        }
        int restArray = SearchLastOccurrence(arr, arr.length, i+1, key);
        if (restArray != -1){
            return restArray;
        }
        if (arr[i] == key){
            return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1,4,3,5,6,7,3,8,4,3,5,3,8};
        System.out.println("First Occurrence : " + SearchFirstOccurrence(arr, arr.length,0,3));
        System.out.println("Last Occurrence : " + SearchLastOccurrence(arr, arr.length,0,3));
    }
}
