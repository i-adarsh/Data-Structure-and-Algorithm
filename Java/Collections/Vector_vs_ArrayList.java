package Collections;

import java.util.ArrayList;
import java.util.Vector;

/*
Vector introduced in jdk 1.0. Vector is type of list which implement list same as array list.
It is dynamic array in which you can increased size of array. vector increased size by 100%

what is difference between ArrayList and Vector?
Vector : 1) when exceed array limit it will increased capacity by 100%. It waste lots of memory.
    2) Vector is thread safe.
    3) It is slow.

ArrayList : 1) when exceed array limit it will increased capacity by 50%. It save memory.
    2) ArrayList is not thread safe.
    3) It is fast.


*/

public class Vector_vs_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> v = new ArrayList<>();
        v.add(5);
//        Vector v = new Vector();
//        v.add(5);
//        v.add(6);
//        v.add(7);
//        v.add(8);
//        v.add(5);
//        v.add(6);
//        v.add(7);
//        v.add(8);
//        v.add(5);
//        v.add(6);
//        v.add(5);
//        v.add(6);
//        v.add(7);
//        v.add(8);
//        v.add(5);
//        v.add(6);
//        v.add(7);
//        v.add(8);
//        v.add(5);
//        v.add(6);
//        System.out.println(v.capacity());
        System.out.println(v.size());
    }
}
