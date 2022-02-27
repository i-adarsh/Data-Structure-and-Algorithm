public class RotateArrayByK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr = {3,2,9,6,5,8};
        int n = 3;
        for (int i = 0; i < n % arr.length; i++){
            int temp = arr[arr.length - 1];
            for(int j = arr.length - 1; j > 0; j--){
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
        for(int a : arr){
            System.out.print(a + " ");
        }
	}
}