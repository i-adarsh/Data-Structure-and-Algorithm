
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr = {3,4,5,1,2,6};
        for(int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1- i] = temp;
        }
        for (int a : arr){
            System.out.print(a + " ");
        }
	}

}