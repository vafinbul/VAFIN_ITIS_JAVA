public class Exists {
    public static void main(String[] args) {
    }
    static boolean StrExists(String [] arr,String str){
    boolean b = false;
    for (int i = 0;i < arr.length & !b;i++){
        if(str.equals(arr[i])){
            b = true;
        }
    }
    return b;
    }
}
