package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class StairsPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(stairsPath(n));
        sc.close();
    }

    public static ArrayList<String> stairsPath(int n){
        if (n == 0){
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }
        if (n < 0){
            ArrayList<String> res = new ArrayList<>();
            return res;
        }
        ArrayList<String> paths = new ArrayList<>();
        
        ArrayList<String> s1 = stairsPath(n - 1);
        ArrayList<String> s2 = stairsPath(n - 2);
        ArrayList<String> s3 = stairsPath(n - 3);

        for (String s : s1){
            paths.add("1" + s);
        }

        for (String s : s2){
            paths.add("2" + s);
        }

        for (String s : s3){
            paths.add("3" + s);
        }

        return paths;
    }
}
