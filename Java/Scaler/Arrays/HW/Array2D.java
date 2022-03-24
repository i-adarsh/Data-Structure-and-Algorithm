public class Array2D{
    public static void main(String [] args){
        int [][] mat = {{-2,1,6,3},{2,9,3,8},{3,-1,3,4}};
        rowSum(mat);
        colSum(mat);
    }

    

    static void rowSum(int [][] mat){
        for(int i = 0; i < mat.length; i++){
            int sum = 0;
            for(int j = 0; j < mat[i].length; j++){
                sum += mat[i][j];
                System.out.print(mat[i][j] + " ");
            }
            System.out.println(" Sum: " + sum);
        }
    }

    static void colSum(int [][] mat){
        for(int i = 0; i < mat[0].length; i++){
            int sum = 0;
            for(int j = 0; j < mat.length; j++){
                sum += mat[j][i];
                System.out.print(mat[j][i] + " ");
            }
            System.out.println(" Sum: " + sum);
        }
    }

}