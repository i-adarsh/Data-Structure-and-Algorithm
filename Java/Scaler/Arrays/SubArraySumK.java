import java.util.ArrayList;

public class SubArraySumK{
    public static void main(String [] args){
        int [] arr = {-3,4,-2,5,3,-2,8,2,-1,4};
        int k = 5;
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count = 0, i = 0;
        for(int a : arr){
            sum += a;
            if (count == (k-1)){
                list.add(sum);
                count--;
                sum -= arr[i];
                i++;
            }
            count++;
        }
        System.out.println(list);
    }
}