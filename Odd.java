import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число элементов: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Введите следующий элемент массива: ");
            int num = sc.nextInt();
            arr[i] = num;
        }

        int sum = 0;
        for (int i = 1; i < n; i = i + 2) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
