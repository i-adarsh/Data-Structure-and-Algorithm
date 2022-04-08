public class Fibonacci2 {
    public static void main(String[] args) {
        fibonacci(4);
    }

    static int fibonacci(int n){
        if (n == 0 || n == 1){
            return n;
        }
        return (fibonacci(n-1) + fibonacci(n-2));

    }
}
