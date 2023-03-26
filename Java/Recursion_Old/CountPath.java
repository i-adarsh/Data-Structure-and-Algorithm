package Recursion_Old;

import java.util.Scanner;

public class CountPath {
    public static int countPath(int start, int end){
        if (start == end){
            return 1;
        }
        if (start > end){
            return 0;
        }
        int count = 0;
        for (int i = 1; i <= 6; i++){
            count += countPath(start+i, end);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println(countPath(kb.nextInt(), kb.nextInt()));
    }
}
