package Recursion;

public class Tower_Of_Hanoi {
    public static void towerOfHanoi(int n, char src, char dest, char helper){
        if (n == 0){
            return;
        }
        towerOfHanoi(n-1, src, helper, dest);
        System.out.println("Move from " + src + " to " + dest);
        towerOfHanoi(n-1, helper, dest, src);
    }

    public static void main(String[] args) {
        towerOfHanoi(3, 'A', 'C', 'B');
    }
}
