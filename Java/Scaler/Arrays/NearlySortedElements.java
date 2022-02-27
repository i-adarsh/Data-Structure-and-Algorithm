
public class NearlySortedElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr = {1,2,3,6,8,13,20,24,27,14};
        String str = "      ";
        System.out.println(str.isBlank());
        int index = 0;
        for(int i = 1; i < arr.length; i++){
            if (arr[i-1] > arr[i]){
                index = i;
            }
        }
        for(int i = 0; i < arr.length; i++){
            if (arr[index] < arr[i]){
                while(arr[i] > arr[index]){
                    int temp = arr[i];
                    arr[i] = arr[index];
                    arr[index] = temp;
                }
            }
        }
        for (int a : arr){
            System.out.print(a + " ");
        }
	}

}