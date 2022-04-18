import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class LargestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(3, 30, 34, 5, 9));
        System.out.println(largestNumber(A));
    }

    public static String largestNumber(List<Integer> A) {
        Comparator<String> com = ( s1,  s2) -> {
            return (s2+s1).compareTo(s1+s2) >= 0? 1 : -1;
        };
        List<String> B = new ArrayList<String>();
        for (int a : A){
            B.add(a + "");
        }
        Collections.sort(B, com);
        StringBuffer str = new StringBuffer();
        for (int s = 0; s < B.size(); s++){
            if (s == 0 && B.get(s).equals("0")){
                str.append(B.get(s));
                break;
            }
            else{
                str.append(B.get(s));
            }
        }
        return str.toString();
    }

}
