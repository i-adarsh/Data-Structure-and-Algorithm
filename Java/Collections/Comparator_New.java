package Collections;

import java.util.Comparator;

/*

If we have our custom class then we are prefer to use comparable otherwise if it is a inbuilt class
where we don't change the definition of the class that time we use Comparator



In comparator interface we have compare() and comparable compareTo(). If you are going with
custom class then it its preferable to go with comparable interface. And if it is in-build class then
we can use comparator.

*/

public class Comparator_New implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2){
            return 0;
        }
        return -1;
    }
}
