public class CountSetBit{

    public static boolean checkBit(int n, int pos){
        return (((n>>pos)&1) == 1);
    }

    public static int countSetBitLoop(int n){
        int count = 0;
        for (int i = 0; i < n; i++){
            if (checkBit(n, i)){
                count++;
            }
        } 
        return count;
    }

    public static int countSetBit(int n){
        int count = 0;
        while(n > 0){
            if ((n&1) == 1){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(countSetBit(25));
        System.out.println(countSetBitLoop(25));
    }
}