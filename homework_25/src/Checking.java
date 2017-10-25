public class Checking {
    public static void main(String[] args) {
    int [] arr = {1,2,3,3,4,5};
        System.out.println(check(arr));
    }
    static boolean check(int [] arr){
    boolean b = false;
    for(int j = 0; j < arr.length & !b;j++){
        for(int i = 0;i < arr.length & !b;i++){
            if(arr[j] == arr[i]){
                b = true;
            }
        }
    }
    return b;
    }

}
