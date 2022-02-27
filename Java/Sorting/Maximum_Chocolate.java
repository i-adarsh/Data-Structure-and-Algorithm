package Sorting;

import java.util.Scanner;

public class Maximum_Chocolate {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int rupees = scanner.nextInt();
        int totalChocolates = 0;
        totalChocolates += rupees;
        while (rupees > 3){
            int rem = rupees / 3;
            totalChocolates += rem;
            rupees /= 3;
        }
        totalChocolates += rupees;
        System.out.println("Total Chocolates : " + totalChocolates);
    }
}
