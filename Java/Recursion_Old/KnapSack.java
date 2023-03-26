package Recursion_Old;

// W -> Weight
public class KnapSack {
    public static int knapSack(int [] value, int [] wt, int n, int W){

        if (n == 0 || W == 0){
            return 0;
        }
        if (wt[n-1] > W){
            return knapSack(value, wt, n-1, W);
        }
        return Math.max(knapSack(value, wt, n-1, W-wt[n-1])+value[n-1], knapSack(value, wt, n-1, W));
    }

    public static void main(String[] args) {
        int [] wt = {10, 20, 30};
        int [] value = {100, 50 ,150};
        int W = 50;
        System.out.println(knapSack(value, wt, 3, W));
    }
}
