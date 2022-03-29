public class MajorityElement{
    public static void main(String [] args){
        // int [] arr = {6,6,8,4,4,7,4,4,4,4,4,6};
        // int [] arr = {3,4,8,3,7,3,3,8,3,3};
        int [] arr = {2,1,1};
        int maj = arr[0];
        int freq = 1;
        for(int i = 1; i < arr.length; i++){
            if (maj == arr[i]){
                freq++;
            }
            else{
                freq--;
                if (freq < 0){
                    maj = arr[i];
                    freq = 0;
                }
            }
            System.out.println(freq);
        }
        System.out.println(maj);
    }
}