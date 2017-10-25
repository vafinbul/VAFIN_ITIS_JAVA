import java.util.Arrays;

public class SwapOfZero {
    public static void main(String[] args) {
        int  [] arr = {1,0,3,6,0};
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int [] arr){
        for(int i = 1;i < arr.length;i++){
            if(arr[i] == 0){
                arr[i] = arr[i-1]*-1;
            }
        }
    }
}
