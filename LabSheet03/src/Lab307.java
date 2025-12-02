import javax.swing.*;
import java.util.Scanner;

public class Lab307 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price;
        double total_price = 0;

        do {
            price = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Input price [press 0 to stop]:",
                "Input",
                JOptionPane.QUESTION_MESSAGE));

            if (price < 0){
                price = Double.parseDouble(JOptionPane.showInputDialog(null,
                        "Invalid price!!\nInput price [press 0 to stop]:",
                        "Input",
                        JOptionPane.QUESTION_MESSAGE));
            }
            total_price += price;
        } while (price != 0);

        JOptionPane.showMessageDialog(null,
                "Total price is " + total_price + " baht.");
    }
}
