import java.util.Scanner;

class Factorial {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int num = sc.nextInt();
        int fact = 1;
        if(num >= 0) {
            for (int i = 2; i <= num; i++) {
                fact*=i;
            }
        }
    }
}
