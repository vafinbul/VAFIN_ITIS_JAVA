import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
    sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int []arr)
    {

        int n = arr.length;
        for (int j = 0; j < n; j++) {
            int indexOfMax = j;
            for (int i = j; i < n; i++) {
                if (arr[indexOfMax] < arr[i]) {
                    indexOfMax = i;
                }
            }
            int buf = arr[j];
            arr[j] = arr[indexOfMax];
            arr[indexOfMax] = buf;    }
}
}