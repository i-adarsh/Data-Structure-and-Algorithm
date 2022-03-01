/*
Reverse the bits of an 32 bit unsigned integer A.
0
00000000000000000000000000000000    
00000000000000000000000000000000
3
00000000000000000000000000000011    
11000000000000000000000000000000
*/
public class ReverseBit{
    public static long reverse(long a) {
        long result = 0;
        for(int i = 0;i<32;i++) {

            result<<=1;
            result+=(a&1);
            a>>=1;
        }
        return result;
	}
    public static void main(String[] args){
        System.out.println(reverse(5));
    }
}