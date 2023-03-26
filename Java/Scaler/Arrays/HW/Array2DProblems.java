public class Array2DProblems{
    public static void main(String [] args){
        // int [][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        // printElements(arr);
        // int [][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};
        // printElements(arr2);
        int [][] arr3 = {{1,6,11},{2,7,12},{3,8,13},{4,9,14},{5,10,15}};
        printElements(arr3);
        int [][] arr4 = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        printElements(arr4);
        int [][] arr5 = {{2,3,4},{7,8,9},{12,13,14,},{17,18,19}};
        printElements(arr5);
    }

    static void printElements(int [][] arr){
        int i = 0, j = 0;
        int n = arr.length;
        int m = arr[0].length;
        while(n >= 1 && m >= 1){
            for(int k = 1; k < m; k++){
                System.out.print(arr[i][j] + " ");
                j++;
            }
            for(int k = 1; k < n; k++){
                System.out.print(arr[i][j] + " ");
                i++;
            }
            for(int k = 1; k < m; k++){
                System.out.print(arr[i][j] + " ");
                j--;
            }
            for(int k = 1; k < n; k++){
                System.out.print(arr[i][j] + " ");
                i--;
            }
            n = n - 2;
            m = m - 2;
            i++;
            j++;
        }
        if (arr.length == arr[0].length){
            System.out.print(arr[i-1][j-1] + " " + " Hii");
        }
        System.out.println();
    }
}