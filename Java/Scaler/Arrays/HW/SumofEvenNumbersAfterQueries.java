import java.util.HashMap;
import java.util.Map;

public class SumofEvenNumbersAfterQueries{
    public static void main(String[] args){
        int queries[][] = { {6,4}, // row 0
                {-7,0}, // row 1
                {-3,5},
                {6,1},
                {-8,1},
                {-10,2} };
        int [] arr = {8,-10,10,-7,4,-2};
        int [] res = sumEvenAfterQueries(arr, queries);
        for (int a : res){
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int sum = 0;
        int [] res = new int[queries.length];
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0 && nums[i] != 0){
                sum += nums[i];
                map.put(i, nums[i]);
            }
        }
        System.out.println("Iterating Hashmap...");  
        for(Map.Entry m : map.entrySet()){    
            System.out.println(m.getKey()+" "+m.getValue());    
        }  
        for (int i = 0; i < queries.length; i++){
            int index = queries[i][1];
            int val = queries[i][0];
            if (map.containsKey(index)){
                System.out.println("If");
                sum -= nums[index];
                nums[index] = nums[index] + val;
                if (nums[index] % 2 == 0){
                    sum = sum + nums[index];
                }
                else{
                    map.remove(index);
                }
                res[i] = sum;
            }
            else{
                System.out.println("Else");
                nums[index] = nums[index] + val;
                if (nums[index] % 2 == 0){
                    map.put(index, nums[index]);
                    sum = sum + nums[index];
                }
                res[i] = sum;
            }
            for (int a : nums){
            System.out.print(a + " ");
            }
            System.out.print(" Sum: " + sum);
            System.out.println();
        }
        return res;
    }
}