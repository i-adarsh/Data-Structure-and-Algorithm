public class SingleNumber{

    public static int singleNumber(final int[] A) {
        int ans = 0;
        for(int a : A){
            ans = ans ^ a;
        }
        return ans;
    }

    public static void main(String [] args){
        final int [] arr = {1,2,4,5,6,5,4,2,1};
        System.out.println(singleNumber(arr));
    }
}