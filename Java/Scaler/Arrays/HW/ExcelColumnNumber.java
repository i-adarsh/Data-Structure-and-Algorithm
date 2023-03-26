public class ExcelColumnNumber{
    public static void main(String [] args){
        System.out.println(titleToNumber("ABCD"));
    }
    public static int titleToNumber(String A) {
        int n = 0;
        int sum = 0;
        for (int i = A.length() - 1; i >= 0; i--){
            sum += (A.charAt(i) - 64) * Math.pow(26, n);
            n++;
        }
        return sum;
    }
}