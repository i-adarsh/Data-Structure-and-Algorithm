package Questions;

import java.util.Scanner;
public class Subarray_With_Given_Sum {
    public static void main(String [] args){
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int finalSum = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        int i = 0, j = 0, start = -1, end = -1, sum = 0;
        while (j < n && sum <= finalSum){
            sum += arr[j];
            j++;
        }
        if (sum == finalSum){
            System.out.println(i+1+" "+j);
            System.exit(0);
        }
        while (j < n){
            while(sum > finalSum){
                sum -= arr[i];
                i++;
            }
            if (sum == finalSum){
                start = i + 1;
                end = j;
                break;
            }
            j++;
        }
        System.out.println(start+" "+end);
    }
}

/*
* 5 12
1 2 3 7 5
* 2 4
*
* 4 5
1 2 3 8
* 2 3
* */