import java.util.ArrayList;
import java.util.Arrays;

public class LeftKRotate{

    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        int k = 2;
        reverse(list, 0, (list.size() - 1));
        reverse(list, 0, k-1);
        reverse(list, k, (list.size() - 1));
        for(int a : list){
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for (int k : B){
            ArrayList<Integer> test = new ArrayList<Integer>();
            for (int a : A){
                test.add(a);
            }
            k = k % test.size();
            reverse(test, 0, (test.size() - 1));
            reverse(test, 0, (test.size() - k - 1));
            reverse(test, (test.size() - k), (test.size() - 1));
            
            list.add(test);
        }
        return list;
    }

    public ArrayList<ArrayList<Integer>> solve2(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for (int k : B){
            ArrayList<Integer> test = new ArrayList<Integer>();
            for (int a : A){
                test.add(a);
            }
            k = k % test.size();
            reverse(test, 0, (test.size() - 1));
            reverse(test, 0, (test.size() - k - 1));
            reverse(test, (test.size() - k), (test.size() - 1));
            
            list.add(test);
        }
        return list;
    }

    public static void reverse(ArrayList<Integer> arr, int start, int end){
        while(start < end){
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);

            start++;
            end--;
        }
    }
}