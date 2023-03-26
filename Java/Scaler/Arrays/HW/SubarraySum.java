public class SubarraySum{
    public static void main(String [] args){
        int [] arr = {2, -3, 4, 6,7, 2, 8};
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}