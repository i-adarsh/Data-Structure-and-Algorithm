package Recursion;

import java.util.Scanner;

public class FloodFill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col =  sc.nextInt();
        int [][] maze = new int[row][col];
        for (int i = 0; i < maze.length; i++){
            for (int j = 0; j < maze[i].length; j++){
                maze[i][j] = sc.nextInt();
            }
        }
        boolean [][] visited = new boolean[row][col];
        printFloodFill(maze, 0, 0, "", visited);
        sc.close();
    }
/* 
4
3
0 1 1
0 0 1
1 0 0
0 1 0
drdrd
*/

    public static void printFloodFill(int [][] maze, int row, int col, String psf, boolean [][] visited){
        // psf -> Path So Far
        if (row < 0 || col < 0 || row == maze.length || 
            col == maze[0].length || maze[row][col] == 1 ||
            visited[row][col] == true){
            return;
        }
        if (row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(psf);
            return;
        }
        
        visited[row][col] = true;
        printFloodFill(maze, row - 1, col, psf + "t", visited);
        printFloodFill(maze, row, col - 1, psf + "l", visited);
        printFloodFill(maze, row + 1, col, psf + "d", visited);
        printFloodFill(maze, row, col + 1, psf + "r", visited);
        visited[row][col] = false;
        

    }
}
