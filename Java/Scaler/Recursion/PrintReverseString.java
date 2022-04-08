public class PrintReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        reverse(str);
    }
    public static void reverse(String s){
        if (s.length() == 1){
            System.out.print(s.charAt(0));
            return;
        }
        reverse(s.substring(1, s.length()));
        System.out.print(s.charAt(0));
    }
}
