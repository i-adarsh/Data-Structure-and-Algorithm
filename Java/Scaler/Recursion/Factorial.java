public class Factorial {
    public static void main(String[] args) {
        solve(5);
    }
    public static int solve(int A) {
        if (A == 0){
            return 1;
        }
        return (solve(A-1) * A);
    }
}
