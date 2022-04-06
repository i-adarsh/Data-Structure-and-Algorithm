import java.util.HashSet;
import java.util.List;

public class LongestConsecutiveSequence {
    public static void main(String [] args){

    }
    public int longestConsecutive(final List<Integer> A) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < A.size(); i++){
            set.add(A.get(i));
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < A.size(); i++){
            int maxL = 0;
            int x = A.get(i);
            if (!set.contains(x-1)){
                while(set.contains(x)){
                    maxL++;
                    x++;
                }
                ans = Math.max(ans, maxL);
            }
        }
        return ans;
    }

    public int longestConsecutive(int[] A) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++){
            set.add(A[i]);
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++){
            int maxL = 0;
            int x = A[i];
            if (!set.contains(x-1)){
                while(set.contains(x)){
                    maxL++;
                    x++;
                }
                ans = Math.max(ans, maxL);
            }
        }
        if (ans == Integer.MIN_VALUE){
            return 0;
        }
        else{
            return ans;
        }
        
    }
    
}
