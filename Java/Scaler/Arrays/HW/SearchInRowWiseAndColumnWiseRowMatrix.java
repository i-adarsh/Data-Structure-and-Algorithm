public class SearchInRowWiseAndColumnWiseRowMatrix{
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
    }
    public int solve(ArrayList<ArrayList<Integer>> A, int B) {
        int i = 0, j = A.get(0).size()-1;
        int res = -1;
        while(i < A.size() && j >= 0){
            if (A.get(i).get(j) == B){
                int a = i;
                int b = 0;
                for(; b < A.get(i).size(); b++){
                    if (A.get(i).get(b) == B){
                        break;
                    }
                }
                if (b < j){
                    j = b;
                }
                res = 0;
                break;
            }
            else if (A.get(i).get(j) > B){
                j--;
            }
            else{
                i++;
            }
        }
        if (res == 0){
            return ((i+1)*1009+(j+1));
        }
        else{
            return -1;
        }
    }
}