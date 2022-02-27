package Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;

public class Comparator_Example {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<Integer>();
        values.add(532);
        values.add(315);
        values.add(436);
        values.add(658);
        values.add(123);

        Comparator<Integer> comparator = new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2){
                    return 0;
                }
                return -1;
            }
        };
        Collections.sort(values, comparator);
        for (int i : values){
            System.out.println(i);
        }
    }
}
