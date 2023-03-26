package Recursion;

import java.util.Scanner;
public class PrintMazePathWithJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printMazePathWithJumps(1, 1, n, m, "");
        sc.close();
    }   
    // sr -> source row
    // sc -> source column
    // dr -> destination row
    // dc -> destination column
    // psf -> path so far
    public static void printMazePathWithJumps(int sr, int sc, int dr, int dc, String psf){
        if (sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }

        for (int ms = 1; ms <= dr - sr; ms++){
            printMazePathWithJumps(sr + ms, sc, dr, dc, psf + "h" + ms);
        }

        for (int ms = 1; ms <= dc - sc; ms++){
            printMazePathWithJumps(sr, sc + ms, dr, dc, psf + "v" + ms);
        }
        
        for (int ms = 1; ms <= dc - sc && ms <= dr - sr; ms++){
            printMazePathWithJumps(sr + ms, sc + ms, dr, dc, psf + "d" + ms);
        }
    }
}


