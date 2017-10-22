public class Arrat {
    public static void main(String[] args) {
        String[] products = new String[5];
        int [] a = new int[10];
        int [][][] arr = {{{1,2,3,4,5},
                        {1,2,3,4,5},
                        {1,2,3,4,5}},
                        {{1,2,3,4,5},
                        {1,2,3,4,5},
                        {1,2,3,4,5}}};
        for(int i =0; i < 10; ++i){
            a[i] = i;
        }

        for(int i = 0; i < 5; ++i){
            int temp = a[i];
            a[i] = a[10-i-1];
            a[10-i-1] = temp;
        }

        for(int i = 0 ; i< arr.length ; ++i){
            System.out.println(arr[i]);
        }
    }
}
