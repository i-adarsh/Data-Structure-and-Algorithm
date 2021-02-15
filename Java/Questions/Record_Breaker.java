import java.util.Scanner;

public class Record_Breaker {
    public static void main(String [] args){
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n+1];
        arr[n] = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        int mx = Integer.MIN_VALUE;
        int ans = 0;

        if (n == 1){
            System.out.println("1");
            System.exit(0);
        }
        for(int i = 0; i < n+1; i++){
            if (arr[i] > mx && arr[i] > arr[i+1] ){
                ans++;
            }
            mx = Math.max(mx, arr[i]);
        }
        System.out.println("Record Breaking Days : "+ans);
    }
}
