import javax.swing.*;
import java.text.*;

public class Lab304 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");

        double weight = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Enter your weight (kg.): ",
                "Input",
                JOptionPane.QUESTION_MESSAGE));
        double height_cm = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Enter your height (cm.): ",
                "Input",
                JOptionPane.QUESTION_MESSAGE));
        double height_m = height_cm/100;
        double bmi = (weight)/(height_m*height_m);

        String bmi_result;
        if (bmi < 18.5)
            bmi_result = "Underweight";
        else if (18.5 <= bmi && bmi <= 24.9)
            bmi_result = "Healthly Weight";
        else if (25 <= bmi && bmi <= 29.9)
            bmi_result = "Overweight";
        else if (bmi >= 30)
            bmi_result = "Obses";
        else
            bmi_result = "error";

        JOptionPane.showMessageDialog(null,
                "Your BMI is " + df.format(bmi) +
                        "\nBMI result is " + bmi_result);

    }
}