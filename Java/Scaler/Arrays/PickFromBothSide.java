import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class PickFromBothSide {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(-533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35));
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2));
        System.out.println( solve(list, 1) );
    }
    public static int solve(ArrayList<Integer> A, int B) {
        int sum = 0;
        int i = 0, j = A.size() - 1;
        Math.pow(3,4);
        int count = 0;
        while((count) != (B)){
            if (A.get(i) > A.get(j) && i < A.size()){
                sum += A.get(i);
                i++;
                count++;
            }
            else if (A.get(i) <= A.get(j) && j >= 0){
                sum += A.get(j);
                j--;
                count++;
            }
        }
        return sum;
    }
}
