package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePathWithJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> res  =mazePathWithJump(1, 1, n, m);
        System.out.println(res);
        sc.close();
    }

    public static ArrayList<String> mazePathWithJump(int sr, int sc, int dr, int dc){
        if (sr == dr && sc == dc){
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }

        ArrayList<String> paths = new ArrayList<>();

        for (int ms = 1; ms <= dc - sc; ms++){
            ArrayList<String> hpaths = mazePathWithJump(sr, sc + ms, dr, dc);
            for (String hpath : hpaths){
                paths.add("h" + ms + hpath);
            }
        }

        for (int ms = 1; ms <= dr - sr; ms ++){
            ArrayList<String> vpaths = mazePathWithJump(sr + ms, sc, dr, dc);
            for (String vpath : vpaths){
                paths.add("v" + ms + vpath);
            }
        }

        for (int ms = 1; ms <= dc - sc && ms <= dr - sr; ms++){
            ArrayList<String> dpaths = mazePathWithJump(sr + ms, sc + ms, dr, dc);
            for (String dpath : dpaths){
                paths.add("d" + ms + dpath);
            }
        }

        return paths;
    }
}
