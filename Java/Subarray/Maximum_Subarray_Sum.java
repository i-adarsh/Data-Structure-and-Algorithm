import java.util.Scanner;

public class Maximum_Subarray_Sum {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);



// Brute Force Approach

//        int n = sc.nextInt();
//        int [] arr = new int[n];
//        for (int i =0; i < n; i++){
//            arr[i] = sc.nextInt();
//        }
//        int maxSum = Integer.MIN_VALUE;
//        for(int i = 0; i < n; i++){
//            int sum = 0;
//            for(int j = i; j < n; j++){
//                for(int k = j; k <= j; k++){
//                    sum += arr[k];
//                }
//                maxSum = Math.max(maxSum, sum);
//            }
//        }
//        System.out.println("Maximum Sum: "+maxSum);








// Cumulative Sum Approach

//        int n = sc.nextInt();
//        int [] arr = new int[n];
//        for (int i =0; i < n; i++){
//            arr[i] = sc.nextInt();
//        }
//        int maxSum = Integer.MIN_VALUE;
//
//        int[] currSum = new int[n+1];
//        currSum[0] = 0;
//
//        for (int i = 1; i <= n; i++){
//            currSum[i] = currSum[i-1] + arr[i-1];
//        }
//
//        for (int i = 1; i <= n; i++){
//            int sum = 0;
//            for (int j = 0; j < i; j++){
//                sum  = currSum[i] - currSum[j];
//                maxSum = Math.max(sum, maxSum);
//            }
//        }
//        System.out.println(maxSum);







// Kadane's Algorithm

        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i =0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < n; i++){
            currentSum += arr[i];
            if (currentSum < 0){
                currentSum = 0;
            }
            maxSum = Math.max(currentSum, maxSum);
        }
        System.out.println(maxSum);
    }
}


/*

5
-1 4 -6 7 -4
7


5
1 -4 3 2 1


4
-1 4 7 2

 */