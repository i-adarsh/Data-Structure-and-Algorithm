package Recursion;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        int c = kb.nextInt();
        int [] arr = {a,b,c};
        int max=0,min;
        double sum=0.0;
        double place=1.0;
        int num;
        for(int i=0;i<3;i++){
            num=arr[i];
            while(num!=0)
            {
                int r=num%10;
                if(r>max)
                    max=r;
                num=num/10;
            }
        }
        for(int i=0;i<3;i++)
        {
            min=Integer.MAX_VALUE;
            for(int j=0;j<3;j++)
            {
                int rem=arr[j]%10;
                if(rem<min)
                    min=rem;
                arr[j]/=10;
            }
            sum=(min+(sum/place));
            sum*=place;
            place*=10;
        }
        System.out.println((int)(max*1000+sum));
    }
}
