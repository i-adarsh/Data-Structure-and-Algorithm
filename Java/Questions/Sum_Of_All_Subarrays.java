import java.util.Scanner;

/*
*
* To find the sum of All the Subarrays present in an Array
* Owner: Adarsh Kumar
* Created On: 12/02/2021
* */

public class Sum_Of_All_Subarrays {
    public static void main(String [] args){
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        // Taking Input in Array
        for (int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        // Finding the Sum of all the Subarrays
        // Brute Force Approach O(n)
        int totalSum = 0;
        for (int i = 0; i < n; i++){
            int sum = 0;
            for (int j = i; j < n; j++){
                sum += arr[j];
                System.out.println(sum);
                totalSum += sum;
            }
        }
        System.out.println("Total Sum : "+totalSum);
    }

}
