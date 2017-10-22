import java.util.Scanner;

class Sorokdva {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite chislo: ");
        int count_42 = 0;
        int number = sc.nextInt();
        while(number != 0) {
            if (number == 42) {
                count_42 = count_42 + 1;
                }
                System.out.println("Vvedite sled chislo: ");
                number = sc.nextInt();
            }
        System.out.println("count of 42: "+count_42);
        }
    }

