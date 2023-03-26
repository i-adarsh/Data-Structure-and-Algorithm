public class NumberOfSetBits{
    public static int numSetBits(int A) {
        int ans = 0;
        while(A > 0){
            if ((A & 1) != 0){
                ans++;
            }
            A /= 2;
        }
        return ans;
    }

    public static void main(String [] args){
        System.out.println(numSetBits(23));
    }
}