import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean change = false;
            for (int j = 0; j < n - i - 1; j++) {
                System.out.println(Arrays.toString(arr));
                if (arr[j] > arr[j + 1]){
                    swap(arr, j, j + 1);
                    change = true;
                    System.out.println(Arrays.toString(arr));
                }
            }
            if (change == false){
                break;
            }
        }
    }

    static void swap (int[] arr, int i1, int i2) {
        int buf = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = buf;
    }
}