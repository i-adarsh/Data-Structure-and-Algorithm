
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr = {3,4,5,1,2,6};
        // for(int i = 0; i < arr.length/2; i++){
        //     int temp = arr[i];
        //     arr[i] = arr[arr.length - 1 - i];
        //     arr[arr.length - 1- i] = temp;
        // }
        reverse(arr, 2, arr.length);
        for (int a : arr){
            System.out.print(a + " ");
        }
	}

    public static void reverse(int [] arr, int start, int end){
        while(start < (end - 1)){
            int temp = arr[start];
            arr[start] = arr[end - 1];
            arr[end - 1] = temp;
            
            start++;
            end--;
        }
    }
}