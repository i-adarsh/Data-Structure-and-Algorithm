public class CheckBit{
    public static boolean checkBitUsingDivision(int n, int pos){
        boolean b = false;
        for(int i = 0; n > 0; i++){
            if (i == pos){
                if (n % 2 == 1){
                    b = true;
                }
            }
            n /= 2;
        }
        return b;
    }

    public static boolean checkBit(int n, int pos){
        return (((n>>pos)&1) == 1);
    }

    public static void main(String[] args){
        System.out.println(checkBit(25,3));
        System.out.println(checkBit(25,2));
        System.out.println(checkBit(24,2));
        System.out.println(checkBit(14,3));
    }
}