import javax.swing.*;
import java.text.*;

public class Lab501 {

    // method คำนวณ bmi
    public static double cal_bmi(double weight , double height_cm){
        double height_m = height_cm/100;
        return weight/(height_m*height_m);
    }

    // method ตรวจสอบผล bmi
    public static String check_bmi(double bmi){
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi >= 18.5 && bmi <=24.9)
            return "Healthy Weight";
        else if (bmi >= 25 && bmi <= 29.9)
            return "Overweight";
        else if (bmi >= 30)
            return "Obese";
        else
            return "Error";

    }

    // method main
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("#.00");

        int bmi_option = JOptionPane.showConfirmDialog(null,
                "Do yoy want to check your BMI?",
                "Check BMI",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (bmi_option == JOptionPane.YES_OPTION){
            double weight = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Enter your weight (kg.):"));
            double height = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Enter your height (cm.):"));

            double bmi = cal_bmi(weight , height);
            String bmi_result = check_bmi(bmi);

            JOptionPane.showMessageDialog(null,
                    "Your BMI = " + df.format(bmi) +
                            "\nYour BMI result = " + bmi_result);
        } else {
            JOptionPane.showMessageDialog(null,
                    "END PROGRAM!!!");
        }

    }
}