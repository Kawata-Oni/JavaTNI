import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat frm = new DecimalFormat("#.#");

        System.out.print("Enter number 1: ");
        double number_1 = scanner.nextDouble();
        System.out.print("Enter number 2: ");
        double number_2 = scanner.nextDouble();

        System.out.println("\nSummation = " + frm.format(number_1 + number_2));
        System.out.println("Subtraction = " + frm.format(number_1 - number_2));
        System.out.println("Multiplication = " + frm.format(number_1 * number_2));
        System.out.println("Division = " + frm.format( number_1 / number_2));
        System.out.println("Modulus = " + frm.format(number_1 % number_2));
    }
}
