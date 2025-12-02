import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Lab206 {
    public static void main(String[] args) {
        DecimalFormat nf = new DecimalFormat("#.00");

        int numberOfCustomer = Integer.parseInt(JOptionPane.showInputDialog(null,
                "How many customer?",
                "Input",
                JOptionPane.QUESTION_MESSAGE));

        double priceWithNET = (299*numberOfCustomer)*1.07;

        int discount = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Price with NET is " + nf.format(priceWithNET) + " baht." +
                        "\nHow much of discount(%) on your coupon?",
                "Input",
                JOptionPane.QUESTION_MESSAGE));

        double totalPrice = priceWithNET-(priceWithNET*discount/100);

        double customerPaid = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Total price is " + nf.format(totalPrice) + " baht." +
                        "\nEnter the amount the customer paid:",
                "Input",
                JOptionPane.QUESTION_MESSAGE));

        double change = customerPaid-totalPrice;

        JOptionPane.showMessageDialog(null,
                "Total price is " + nf.format(totalPrice) + " baht." +
                        "\nCustomer paid " + nf.format(customerPaid) + " baht." +
                        "\nGet change " + nf.format(change) + " baht.");
    }
}
