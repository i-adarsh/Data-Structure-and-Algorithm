import java.util.Scanner;

public class SetBitofNNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double res = (calculateSetBits(n) % 1000000007);
        System.out.println((int)res);
	}
    // Formula
    // 2^(x-1) * x + (n - 2^x + 1) + Solve(n - 2^x);
    public static double calculateSetBits(double n){
        if (n < 0){
            return 0;
        }
        if ( n == 0 || n == 1){
            return n;
        }
        int power = countPower(n);
        return (Math.pow(2, (power - 1)) * power + (n - Math.pow(2, power) + 1) + 
        calculateSetBits(n - Math.pow(2, power)));
    }

    public static int countPower(double n){
        int res = 0;
        while(Math.pow(2,res) <= n){
            res++;
        }
        res--;
        return res;
    }

    public int test(int n){
        int mod = 1000000000+7;
        int ans = 0;
        while (n > 0) {

            int x = 0;
            while ((1 << (x)) <= n) {
                x++;
            }
            x--;
            ans += (((1 << (x - 1)) * x)%mod + (n - (1 << x) + 1)%mod)%mod;
            n -= (1 << x);
        }
        return ans%(int)mod;
    }

}