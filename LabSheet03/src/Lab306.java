import javax.swing.JOptionPane;

public class Lab306 {
    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Enter an integer number: ",
                "Input",
                JOptionPane.QUESTION_MESSAGE));

        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        JOptionPane.showMessageDialog(null,
                "Summation of 1 to " + N + " is " + sum);
    }
}
