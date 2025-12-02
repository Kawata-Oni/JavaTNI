import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.util.Locale;

public class Lab207 {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);

        JOptionPane.showMessageDialog(null, "Welcome to the payroll application");

        String employeeName = JOptionPane.showInputDialog(null,
                "Enter employee name:", "Input", JOptionPane.QUESTION_MESSAGE);

        String hourWorkedInput = JOptionPane.showInputDialog(null,
                "Enter total hour for this employee:", "Input", JOptionPane.QUESTION_MESSAGE);
        int hourWorked = Integer.parseInt(hourWorkedInput);

        final double HOURLY_WAGE = 7.50;
        double grossEarnings = hourWorked*HOURLY_WAGE;
        final double TEX_RATE = 0.15;
        double tax = grossEarnings*TEX_RATE;
        double netEarning = grossEarnings-tax;

        JOptionPane.showMessageDialog(null,
                "Employee name: " + employeeName +
                        "\nHour worked: " + hourWorked +
                        "\nHourly wage: " + nf.format(HOURLY_WAGE) +
                        "\nGross earnings: " + nf.format(grossEarnings) +
                        "\nTax rate: " + TEX_RATE +
                        "\nTax: " + nf.format(tax) +
                        "\nNet earnings: " + nf.format(netEarning));
    }
}
