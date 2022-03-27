public class Scaler{
    public static void main(String[] args){
        int [] arr = {1,0,0,0,1};
        int [][] q = {{2,4},{1,5},{3,5}};
        int [][] res = solve(arr, q);
        for (int [] a : res){
            for (int i : a){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static int[][] solve(int[] A, int[][] B) {
        int [] sum = new int[A.length];
        for (int i = 0; i < A.length; i++){
            if (i == 0){
                if(A[i] == 0){
                    sum[i] = 1;
                }
            }
            else if (A[i] == 0){
                sum[i] = sum[i-1] + 1;
            }
            else{
                sum[i] = sum[i-1];
            }
        }
        for (int i : sum){
            System.out.print(i + " ");
        }
        System.out.println();
        int [][] res = new int[B.length][2];
        for (int i = 0; i < B.length; i++){
            int s = B[i][0];
            int e = B[i][1];
            int count = s - e + 1;
            int xor = 0;
            if (s == 1){
                res[i][1] = sum[e - 1];
                xor = res[i][1];
            }
            else{
                res[i][1] = sum[e - 1] - sum [s - 2];
                xor = res[i][1];
            }
            if ((count - xor) % 2 == 0){
                res[i][0] = 0;
            }
            else{
                res[i][0] = 1;
            }
            
        }
        return res;
    }
}