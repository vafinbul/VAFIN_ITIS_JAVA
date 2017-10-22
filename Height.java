import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число элементов: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n;i++){
                System.out.println("Введите рост: ");
                arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n ;i++){
           sum += arr[i];
        }

        double avg = (double)sum/n;
        int count = 0;
        for (int i = 0;i < n;i++ ){
            if(arr[i] > avg){
                count+=1;
            }
        }
        System.out.println(count);
    }
}