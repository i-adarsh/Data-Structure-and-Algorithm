
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // int [] arr = {3,4,5,1,2,6};
        // int [] arr = {-3,4,2,8,7,9,6,2,10};
        int [] arr = {3,-2,1,4,6,9,8};
        int [] arr2 = {2,6};
        int sum = 0;
        for(int a : arr2){
            sum ^= a;
        }
        System.out.println("Sum " + sum);
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2.length; j++){
                System.out.println("Sum of " + arr2[i] + " " + arr2[j] + " " + (arr2[i]^arr2[j]));
            }
        }
        // for(int i = 0; i < arr.length/2; i++){
        //     int temp = arr[i];
        //     arr[i] = arr[arr.length - 1 - i];
        //     arr[arr.length - 1- i] = temp;
        // }
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, 3);
        reverse(arr, 4, arr.length-1);
        for (int a : arr){
            System.out.print(a + " ");
        }
	}

    public static void reverse(int [] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }
}