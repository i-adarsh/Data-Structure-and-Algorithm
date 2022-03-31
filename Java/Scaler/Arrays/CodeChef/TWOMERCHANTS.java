import java.util.*;

public class TWOMERCHANTS{
    public static void main(String [] args){
        int a1 = 0;
        int a2 = 0;
        int money = 27;
        ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(3, 6, 17, 28, 30));
        ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(1, 3, 4, 5, 7, 9, 21, 27, 29, 30));
        int i = arr1.size() - 1, j = arr2.size() - 1;
        while ((arr1.size() > 0 && arr2.size() > 0) && (i >= 0 && j >= 0)){
            int v1 = (arr1.get(i)) + a1;
            int v2 = (arr2.get(j)) + a2;
            boolean flag = true;
            if (v2 <= money){
                arr2.remove(new Integer(v2 - a2));
                a2++;
                a1--;
                flag = false;
            }
            if (v1 <= money){
                arr1.remove(new Integer(v1 - a1));
                a1++;
                a2--;
                flag = false;
            }
            if(flag){
                i--;
                j--;
            }
        }

        for (int a : arr1){
            System.out.println(a + " ");
        }
        System.out.println();
        for (int a : arr2){
            System.out.print(a + " ");
        }
        System.out.println();

        if ((i + j) == (arr1.size() + arr2.size())){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}