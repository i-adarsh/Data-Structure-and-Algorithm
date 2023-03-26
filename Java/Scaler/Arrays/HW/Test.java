public class Test{
    public static void main(String [] args){
        // int [][] A = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        // int [][] B = {{9, 8, 7},{6, 5, 4},{3, 2, 1}};
        int [][] A = {{6},{2},{3},{10},{1},{3}};
        int [][] B = {{6},{7},{3},{8},{1},{2}};
        System.out.println(A.length);
        System.out.println(B.length);
        for (int i = 0; i < A.length; i++){
            for(int j = 0; j < A[0].length; j++){
                A[i][j] += B[i][j]; 
            }
        }
        for (int [] a : A){
            for (int i : a){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}