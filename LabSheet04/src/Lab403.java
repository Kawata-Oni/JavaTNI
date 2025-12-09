import javax.swing.*;

public class Lab403 {
    public static void main(String[] args) {
        final String USERNAME = "admin";
        final String PASSWORD = "Admin1234";
        String username;
        String password;
        boolean login;

        do{
            username = JOptionPane.showInputDialog(null,
                    "Enter username: ",
                    "Input",
                    JOptionPane.QUESTION_MESSAGE);
            password = JOptionPane.showInputDialog(null,
                    "Enter password: ",
                    "Input",
                    JOptionPane.QUESTION_MESSAGE);

            if (username.equalsIgnoreCase(USERNAME) && password.equals(PASSWORD)){
                login = true;
                JOptionPane.showMessageDialog(null,
                        "Login Success!!");
                break;
            } else {
                login = false;
                JOptionPane.showMessageDialog(null,
                        "Login Fail...");
                continue;
            }
        } while (login == false);
    }
}
