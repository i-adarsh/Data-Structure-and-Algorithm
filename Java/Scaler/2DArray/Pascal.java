import java.util.ArrayList;

public class Pascal {
    public static void main(String [] args){
        solve(25);
    }
    public static ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list;
        
        for (int i = 1; i <= A; i++){
            list = new ArrayList<Integer>();
            
            if (i == 1){
                list.add(1);
            }

            else{
                long n = factorial(i-1);
                int j, end = (i % 2 == 0)?(i/2):((i/2)+1);
                // System.out.println("end= " + end);
                for (j = 0; j < end; j++){
                    // int jfact = factorial(j);
                    // int ijfact = factorial(i - 1 - j);
                    // System.out.println("n= " + n + " jfact= " + jfact + " ijfact=" + ijfact + " i=" + i);
                    long sum = (n/(factorial(j) * factorial(i - 1 - j)));
                    list.add((int)sum);
                    // System.out.println("sum = " + sum);    
                }
                // System.out.println("list = " + list + " j = " + j +" i=" + i);
                // System.out.println("j = " + j);
                j--;
                if (i % 2 != 0) {j--;}
                // System.out.println("j = " + j);
                for (int k = j; k >= 0; k--){
                    list.add(list.get(k));
                }
            }
            
            while(list.size() < A){
                list.add(0);
            }

            result.add(list);
        }
        System.out.println(result);
        return result;
    }
    public static long factorial (int n){
        if (n == 0) return 1;
        long ans = 1;
        for (int i = 2; i <= n; i++){
            ans *= i;
        }
        return ans;
    }
}
