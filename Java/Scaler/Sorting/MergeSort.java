package Scaler.Sorting;

public class MergeSort {
    public static void main(String[] args) {
        // mergeSort(new int [] {-1,4,8}, 3, new int [] {2,9}, 2);
        mergeSortIndex(new int [] {4,8,-1,2,6,3,4,7,13,0}, 3, 5, 8);
    }

    public static void mergeSortIndex(int arr[], int s, int m, int e){
        int [] res = new int [e - s + 1];
        int p1 = s, p2 = m+1, p3 = 0;
        while (p1 <= m && p2 <= e){
            if (arr[p1] < arr[p2]){
                res[p3] = arr[p1];
                p1++;
                p3++;
            }
            else{
                res[p3] = arr[p2];
                p2++;
                p3++;
            }
        }

        while(p1 <= m){
            res[p3] = arr[p1];
            p1++;
            p3++;
        }
        while (p2 <= e){
            res[p3] = arr[p2];
            p2++;
            p3++;
        }

        for (int i = 0; i < (e - s); i++){
            arr[s + i] = res[i];
        }

        print(arr);

    }

    public static int [] mergeSort(int arr [], int N, int brr [], int M){
        int [] res = new int [N + M];
        int p1 = 0, p2 = 0, p3 = 0;
        while (p1 < N && p2 < M){
            if (arr[p1] < brr[p2]){
                res[p3] = arr[p1];
                p1++;
                p3++;
            }
            else{
                res[p3] = brr[p2];
                p2++;
                p3++;
            }
        }
        while (p1 < N){
            res[p3] = arr[p1];
            p1++;
            p3++;
        }
        while (p2 < M){
            res[p3] = brr[p2];
            p2++;
            p3++;
        }
        print(res);
        return res;
    }
    public static void print(int [] arr){
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
