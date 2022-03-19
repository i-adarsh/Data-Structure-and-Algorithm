public class LeftMax{
    public static void main(String [] args){
        int [] arr = {3,2,4,1,2,-1,3,0,1};
        int [] lmax = new int[arr.length];
        lmax[0] = arr[0];
        for (int i = 1; i < arr.length; i++){
            lmax[i] = Math.max(lmax[i - 1], arr[i]);
        }
        for (int i : lmax){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}