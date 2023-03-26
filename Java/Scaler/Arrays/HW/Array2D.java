public class Array2D{
    public static void main(String [] args){
        int [][] mat = {{-2,1,6,3},{2,9,3,8},{3,-1,3,4}};
        int [][] m2 = {{7,15,9,23,21},{31,2,27,3,6},{24,4,10,17,29},{17,16,20,13,12},{8,7,5,14,1}};
        // rowSum(mat);
        // colSum(mat);
        // lDiagonal(m2);
        // rDiagonal(m2);
        // rlDiagonal(mat);
        // for (int [] a : m2){
        //     for (int i : a){
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }
        // transposeInplace(m2);
        // for (int [] a : m2){
        //     for (int i : a){
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("\n=======\n");
        // for (int [] a : mat){
        //     for (int i : a){
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }
        // int [][] res = transpose(mat);
        // System.out.println("\n=======\n");
        // for (int [] a : res){
        //     for (int i : a){
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("\n=======\n");
        // for (int [] a : mat){
        //     for (int i : a){
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }
        // // int [][] rotate = rotate90ByAdarsh(mat);
        // int [][] rotate = rotate90ByAdarsh(mat);
        // System.out.println();
        // for (int a[] : rotate){
        //     for(int i : a){
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("\n=======\n");
        // rotateBy90(m2);
        int [][] m3 = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] dia = diagonal(m3);
        for(int [] a : dia){
            for(int i : a){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static int[][] diagonal(int[][] A) {
        int[][] res = new int[2*A.length - 1][A.length];
        for (int i = 0; i < A.length; i++){
            int j = i;
            int k = 0;
            while(j >= 0 && k < A.length){
                res[i][k] = A[k][j];
                k++;
                j--;
            }
        }
        for (int i = 1; i < A.length; i++){
            int j = i;
            int k = A.length-1;
            while (j < A.length && k >= 0){
                res[j+k][j-i] = A[j][k];
                j++;
                k--;
            }
        }
        return res;
    }

    static int[][] rotate90ByAdarsh(int [][] mat){
        int [][] res = new int[mat[0].length][mat.length];
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                res[j][mat.length-1-i] = mat[i][j];
            }
        }
        return res;
    }

    static int[][] rotateBy90(int [][] mat){
        if (mat.length == mat[0].length){
            transposeInplace(mat);
            for(int [] a : mat){
                reverse(a, 0, a.length - 1);
            }
            return mat;
        }
        else{
            int [][] res = transpose(mat);
            for(int [] a : res){
                reverse(a, 0, a.length - 1);
            }
            return res;
        }
    }

    static void reverse(int arr[], int i , int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static int[][] transpose(int [][] mat){
        int [][] res = new int[mat[0].length][mat.length];
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                res[j][i] = mat[i][j];
            }
        }
        return res;
    }

    static void transposeInplace(int [][] mat){
        for (int i = 0; i < mat.length; i++){
            for(int j = i; j < mat.length; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }

    static void rlDiagonal(int [][] mat){
        for(int i = 0; i < mat[0].length; i++){
            int k = i, j = 0;
            while(k >= 0 && j < mat.length){
                System.out.print(mat[j][k] + " ");
                k--; j++;
            }
            System.out.println();
        }
        for(int i = 1; i < mat.length; i++){
            int k = i, j = mat[0].length - 1;
            while(k < mat.length && j >= 0){
                System.out.print(mat[k][j] + " ");
                k++;
                j--;
            }
            System.out.println();
        }
    }

    // static void lrDiagonal(){

    // }

    static void lDiagonal(int [][] mat){
        for(int i = 0; i < mat.length; i++){
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();
    }
    static void rDiagonal(int [][] mat){
        int i = 0, j = mat[0].length - 1;
        while(i < mat.length && j >= 0){
            System.out.print(mat[i][j] + " ");
            i++;
            j--;
        }
        System.out.println();
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