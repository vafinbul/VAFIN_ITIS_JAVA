import java.util.Scanner;

public class Moduk {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int num = sc.nextInt();
        int max = Math.abs(num);
        while(num != 0 ){
            num = sc.nextInt();
            if(Math.abs(num)>max){
                max = Math.abs(num);
            }
        }
        System.out.println(max);
    }
}
