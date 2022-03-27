public class ABModulo{
    public static void main(String [] args){
        System.out.println(solve(5, 10));
    }

    public int solve(int A, int B) {
        return (A > B ? (A - B) : (B - A));
    }

}

/*
Properties :-
1. (a + b) % M = (a % M + b % M) % M;
2. (a * b) % M = (a % M * b % M) % M;
3. (a - b) % M = (a / b) % M;

*/

/* Given two integers A and B, find the greatest possible positive integer M, such that A % M = B % M.
1 <= A, B <= 109
A != B
*/