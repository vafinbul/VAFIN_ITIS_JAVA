import java.util.Scanner;

public class Power2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int number = sc.nextInt();
        System.out.println("Введите степень");
        int power = sc.nextInt();
        System.out.println(Math.pow(number , power));
    }
}
