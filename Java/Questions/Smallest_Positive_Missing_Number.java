package Questions;

import java.util.Scanner;
public class Smallest_Positive_Missing_Number {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];

        // Taking Input in Array
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        int N = (int) (1e6 + 2);
        boolean [] brr = new boolean[N];
        for (int i = 0; i < N; i++)
            brr[i] = false;

        for (int i = 0; i < n; i++){
            if (arr[i] >= 0){
                brr[arr[i]] = true;
            }
        }
        int ans = -1;
        for (int i = 0; i < n ; i++){
            if (brr[i] == false){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
