package Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MazePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(mazePath(1, 1, n, m));
        sc.close();
    }
    public static ArrayList<String> mazePath(int sc, int sr, int dc, int dr){
        if (sc == dc && sr == dr){
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }

        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();

        if (sc < dc){
            hpaths = mazePath(sc + 1, sr, dc, dr);
        }

        if (sr < dr){
            vpaths = mazePath(sc, sr + 1, dc, dr);
        }

        ArrayList<String> paths = new ArrayList<>();

        for (String hpath : hpaths){
            paths.add("h" + hpath);
        }

        for (String vpath : vpaths){
            paths.add("v" + vpath);
        }
        
        return paths;

    }
}
