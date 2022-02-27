package Questions;

import java.util.Scanner;
public class First_Repeating_Element {
    public static void main(String [] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        int N = (int) (1e6+2);
        int[] brr = new int[N];
        for (int i = 0; i < N; i++){
            brr[i] = -1;
        }
        int minIdx = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if (brr[arr[i]] != -1){
                minIdx = Integer.min(minIdx, brr[arr[i]]);
            }
            else {
                brr[arr[i]] = i;
            }
        }
        if (minIdx == Integer.MAX_VALUE){
            System.out.println("-1");
        }
        else {
            System.out.println(minIdx+1);
        }
    }
}
