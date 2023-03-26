public class SumOfDigits {
    public static void main(String[] args) {
        solve(67);
    }
    public static int solve(int A) {
        if (A >= 0 && A <= 9){
            return A;
        }
        return ((A%10) + solve(A/10));
    }
}
