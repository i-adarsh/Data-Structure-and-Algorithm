import java.util.ArrayList;

public class Subset{
    public static void main(String [] args){
        ArrayList<Integer> arr = new ArrayList<Integer>(10);
        System.out.println(arr.size());
        // for(int i = 0; i < arr.length; i++)
    }
    public static int solve(ArrayList<Integer> A, int n){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int a : A){
            if (!arr.contains(a)){
                arr.add(a);
            }
            else{
                continue;
            }
        }
        return arr.size();
    }
}