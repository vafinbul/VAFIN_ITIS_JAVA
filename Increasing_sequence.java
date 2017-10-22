import java.util.Scanner;

public class Increasing_sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во элементов(минимум 2)");
        int n = sc.nextInt();
        boolean isincreasing = true;
        int num;
        System.out.println("Введите первый элемент ");
        int prev = sc.nextInt();
        for(int i= 0;i < n-1;i++){
            num = sc.nextInt();
            if(num <= prev){
                isincreasing = false;
            }
        }
        if (isincreasing){
            System.out.println("возрастающая");
        }
        else{
            System.out.println("не возрастающая");
        }
    }
}
