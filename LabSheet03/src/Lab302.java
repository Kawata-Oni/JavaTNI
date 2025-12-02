import javax.swing.*;

public class Lab302 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null,
                "Enter your name:",
                "Input",
                JOptionPane.QUESTION_MESSAGE);
        double height = Double.parseDouble (JOptionPane.showInputDialog(null,
                "Enter your height (cm.):",
                "Input",
                JOptionPane.QUESTION_MESSAGE));
        int gender_male_choice = JOptionPane.showConfirmDialog(null,
                "Are your biological gender is Male?",
                "Gender",
                JOptionPane.YES_NO_OPTION);

        if (gender_male_choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,
                    "Hello, Mr. " + name +
                            "\nIf your height is " + height + " cm." +
                            "\nYour weight should be " + (height - 100) + " kg.");
        } else if (gender_male_choice == JOptionPane.NO_OPTION){
            int gender_female_choice = JOptionPane.showConfirmDialog(null,
                    "Are your biological gender is Female?",
                    "Gender",
                    JOptionPane.YES_NO_OPTION);
            if (gender_female_choice == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null,
                        "Hello, Ms. " + name +
                                "\nIf your height is " + height + " cm." +
                                "\nYour weight should be " + (height - 110) + " kg.");
            } else if (gender_male_choice == JOptionPane.NO_OPTION)
                JOptionPane.showMessageDialog(null,
                        "You can use BMI to measure your weight and height.");
        }
    }
}