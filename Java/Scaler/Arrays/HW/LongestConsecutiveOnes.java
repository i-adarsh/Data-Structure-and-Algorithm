public class LongestConsecutiveOnes{
    public static void main(String [] args){
        System.out.println(solve("01"));
    }
    public int solve(String A) {
        int count = 0;
        for (int i = 0; i < A.length(); i++){
            if(A.charAt(i) == '1'){
                count++;
            }
        }
        if (count == A.length()){
            return count;
        }
        int len = 0;
        int [] right = new int[A.length()];
        int n = A.length();
        right[n-1] = Integer.parseInt(A.charAt(n-1)+"");
        for (int i = n-2; i >= 0; i--){
            if(A.charAt(i) == '1'){
                right[i] = right[i+1] + 1;
            }
            else{
                right[i] = 0;
            }
        }
        int sum = 0;
        for(int i = 0; i < A.length(); i++){
            if (A.charAt(i) == '0'){
                int r = 0;
                if (i == (A.length()-1)){
                    r = 0;
                }
                else{
                    r = right[i+1];
                }
                int total = (sum + r);
                if (count > total){
                    total++;
                }
                len = Math.max(len, total);
                sum = 0;
            }
            else{
                sum += 1;
            }
        }
        return len;
    }
}