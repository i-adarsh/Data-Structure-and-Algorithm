import java.util.Scanner;
/*
* To Find the Maximum Number in a Unsorted Array O(n)
* */
public class Maximum_In_Unsorted {
    public static void main (String [] args){
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        //Taking Input in Array
        for (int  i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        // Finding Algorithm
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < n ;i++){
            maximum = Math.max(maximum, arr[i]);
        }
        System.out.println("Maximum : " + maximum);
    }
}
