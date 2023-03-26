/*
Given an array of integers arr[] of length N, 
every element appears thrice except for one which occurs once.
Find that element which occurs once.
Input:
N = 4
arr[] = {1, 10, 1, 1}
Output:
10
Explanation:
10 occurs once in the array while the other
element 1 occurs thrice.
*/

public class SingleNumberThrice{

    public static void main(String [] args){
        int [] arr = {0,1,0,1,0,1,99};
        int ans = 0;
        for(int i = 31; i >= 0; i--){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                count += ((arr[j]>>i)&1);
            }
            ans <<= 1;
            ans += (count%3);
        }
        System.out.println(ans);
    }
}