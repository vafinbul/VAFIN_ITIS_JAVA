import java.util.Scanner;

public class Upper {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите букву");
        char c = sc.next().charAt(0);
        if (c >= 'A' & c <= 'Z' ){
            char upperChar = (char)(c + 32);
            System.out.println(upperChar);
        }
        else{
            char lowerChar = (char)(c - 32);
            System.out.println(lowerChar);
        }
    }
}
