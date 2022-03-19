public class RightMax{
    public static void main(String [] args){
        int [] arr = {3,2,4,1,2,-1,3,0,1};
        int [] rmax = new int[arr.length];
        rmax[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i  >= 0; i--){
            rmax[i] = Math.max(rmax[i + 1], arr[i]);
        }
        for (int a : rmax){
            System.out.print(a + " ");
        }
        System.out.println();
    }
}