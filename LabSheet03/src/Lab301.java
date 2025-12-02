import java.util.Scanner;

public class Lab301 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        String even_odd;
        String positive_negative_zero;

        System.out.print("Enter an integer number: ");
        number = scanner.nextInt();

        even_odd = (number%2 == 0) ? "Even" : "Odd";

        if (number == 0)
            System.out.println("This number is Zero Number.");
        else {
            if (number > 0)
                System.out.println("This number is " + even_odd + " and Positive Number.");
            else
                System.out.println("This number is " + even_odd + " and Negative Number.");
        }
    }
}