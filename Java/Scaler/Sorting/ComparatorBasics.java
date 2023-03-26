package Scaler.Sorting;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorBasics {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>(Arrays.asList("33", "90", "39"));
        List<String> str1 = new ArrayList<>(Arrays.asList("38", "31", "35"));
        List<String> str2 = new ArrayList<>(Arrays.asList("9", "89", "91"));
        List<String> str3 = new ArrayList<>(Arrays.asList("9", "90", "908"));
        List<String> str4 = new ArrayList<>(Arrays.asList("2", "3"));
        comparatorBasics(str);
        comparatorBasics(str1);
        comparatorBasics(str2);
        comparatorBasics(str3);
        comparatorBasics(str4);
    }

    public static void comparatorBasics(List<String> str){
        Collections.sort(str, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });
        print(str);
        /*
        Collections.sort(str, new Comparator<String>(){
            public int compare(String s1, String s2){
                if (Long.parseLong(s1+s2) > Long.parseLong(s2+s1)){
                    return -1;
                }
                else return 1;
            }
        });
         */

    }

    public static <T> void print(List<T> list){
        for (T element : list){
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
