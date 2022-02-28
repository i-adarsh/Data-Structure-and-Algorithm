public class OddEven{
    public static void main(String [] args){
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
        for (int a : arr){
            if ((a & 1) == 0){
                System.out.print("Even ");
            }
            else if ((a & 1) == 1){
                System.out.print("Odd ");
            }
        }
    }
}