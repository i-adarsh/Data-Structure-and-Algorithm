import java.util.HashMap;

public class ColorFullNumber {
    public static void main(String [] args){
        System.out.println(colorful(3245));
    }
    public static int colorful(int A) {
        String str = A + "";
        HashMap<String, Long> map = new HashMap<String, Long>();
        int l = 1;
        while (l < str.length()){
            for (int i = 0; i < str.length() && (i+l) <= str.length(); i++){
                String s = str.substring(i, i+l);
                long p = product(s);
                if (map.containsKey(s) || map.containsValue(p)){
                    return 0;
                }
                else{
                    map.put(s, p);
                }
            }
            l++;
        }
        if (map.containsValue(product(str))){
            return 0;
        }
        else{
            return 1;
        }
    }

    static long product(String str){
        long ans = 1;
        for (int i = 0; i < str.length(); i++){
            ans *= Long.parseLong(str.charAt(i) + "");
        }
        return ans;
    }
}
