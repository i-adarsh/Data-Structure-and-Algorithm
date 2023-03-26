import java.util.ArrayList;
import java.util.Arrays;

public class EquilibriumArray{
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 7, 1, 2, 3));
        System.out.println(equilibriumAray(list));
    }
    static int equilibriumAray(ArrayList<Integer> A){
        int count = 0;
        int n = A.size();
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int a : A){
            sum += a;
            System.out.print(sum + " ");
            list.add(sum);
        }
        System.out.println();
        System.out.println(((list.get(n - 1)) - (A.get(0))));
        if (0 == ((list.get(n - 1)) - (A.get(0)))){
            System.out.println(((list.get(n - 1)) - (A.get(0))));
            count++;
        }
        for (int i = 1; i < n; i++){
            int left = list.get(i - 1);
            int right = list.get(n - 1) - list.get(i);
            System.out.println("Left: " + left + " Right: " + right);
            if (left == right){
                count++;
            }
        }
        if (count == 0){
            return -1;
        }
        return count;
    }
}