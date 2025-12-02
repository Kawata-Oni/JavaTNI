import java.util.Scanner;

public class Lab305 {
    public static void main(String[] args) {
        int number_1;
        int number_2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        number_1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        number_2 = scanner.nextInt();
        if (number_1<number_2){
            for ( int i = number_1 ; i <= number_2; i++) {
                if (i%2 == 0)
                    System.out.print(i + " ");
            }
        }
        else if (number_2<number_1){
            for ( int i = number_1 ; i >= number_2; i--) {
                if (i%2 == 0)
                    System.out.print(i + " ");
            }
        }
    }
}
