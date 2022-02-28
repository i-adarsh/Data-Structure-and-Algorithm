public class OddEven{
    public static void main(String [] args){
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
        /*
            1. If (a & 1 == 0), then a is even and its LSB is 0.
            2. If (a & 1 == 1), then a is odd and its LSB is 1.
            3. If (a | 1 == a + 1), then a is even.
            4. If (a | 1 == a), then a is odd.
        */
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