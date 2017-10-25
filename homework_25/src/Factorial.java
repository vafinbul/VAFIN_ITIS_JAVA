public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5,1));//n-count,f -просто один чтобы ошибку не выдавал
    }
    static int fact(int n,int f){
        for(int i = 1;i <= n;i++){
            f = f*i;
        }
        return f;
    }
}
