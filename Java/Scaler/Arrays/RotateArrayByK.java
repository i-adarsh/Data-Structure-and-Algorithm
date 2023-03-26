public class RotateArrayByK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // int [] arr = {3,2,9,6,5,8};
        // int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
        int [] arr = {2,4,6,8,10,12,14,16,18,20};
        // int [] arr = {1,2};
        int n = 3, k = 3;
        k = k % arr.length;
        swap(arr, 0, arr.length-1);
        swap(arr, 0, (k-1));
        swap(arr, k, arr.length-1);
        for(int a : arr){
            System.out.print(a + " ");
        }
	}

    public static void swap(int nums[],int i,int j){
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            
            i++;
            j--;
        }
    }

    public static int[] reverse(int [] arr, int start, int end){
        int mid = (start + end)/2;
        int count = 0;
        for (int i = start; i < mid; i++){
            int temp = arr[i];
            arr[i] = arr[end - 1 - count];
            arr[end - 1 - count] = temp;
            count++;
        }
        return arr;
    }

    public static int [] shift(int [] arr){
        for (int i = 0; i < (arr.length); i++){
            int temp = arr[arr.length - 1];
            for(int j = arr.length - 1; j > 0; j--){
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
        return arr;
    }

}