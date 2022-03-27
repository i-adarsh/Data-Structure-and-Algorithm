import java.util.*;

public class CodeChef{
    public static void main(String[] args){
        double secondRoot = 0, firstRoot = 0;
      Scanner sc = new Scanner(System.in);

      double a = 1;
      double b = -17;
      double c = 72;

      double determinant = (b*b)-(4*a*c);
      double sqrt = Math.sqrt(determinant);
        System.out.println(determinant +" and "+ sqrt);

         firstRoot = (-b + sqrt)/(2*a);
         secondRoot = (-b - sqrt)/(2*a);
         System.out.println("Roots are :: "+ firstRoot +" and "+ secondRoot);
    }
}

14
101 10098 989901 9900
150000000 25000 5000 1
0 2 1 1
0 1 16 64
0 0 0 0
0 4 4 1
0 -5 9500 195
-99 0 101 100
99 0 101 100
1368 81 33 2
-1 72 0 17
1368 81 -33 0
0 -1 19 90
1 4 5 6
