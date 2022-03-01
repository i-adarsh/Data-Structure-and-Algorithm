/*
Given an array of numbers A , 
in which exactly two elements appear only once and all the other elements appear exactly twice. 
Find the two elements that appear only once.

Note: Output array must be sorted.
*/
public class TwoElementsAppears{

    public static boolean setBits(int n, int pos){
        return ((n>>pos)&1)==1;
    }

    public static int[] solve(int [] A){
        int sum = 0;
        for (int a : A){
            sum = sum ^ a;
        }
        int pos = 0;
        while(sum > 0){
            if (setBits(sum, pos)){
                break;
            }
            pos++;
        }
        int set = 0, unset = 0; 
        for(int a : A){
            if (setBits(a, pos)){
                set = set ^ a;
            }
            else{
                unset = unset ^ a;
            }
        }
        int [] arr = {Math.min(set, unset), Math.max(set, unset)};
        return arr;
    }

    public static void main(String[] args){
        int [] arr = {1, 2, 3, 1, 2, 4};
        arr = solve(arr);
        for(int a: arr){
            System.out.print(a + " ");
        }
        System.out.println();
    }
}