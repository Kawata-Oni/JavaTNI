import javax.swing.*;

public class Lab401 {
    public static void main(String[] args) {
        while (true) {
            String fullName = JOptionPane.showInputDialog(null,"Enter your full name:");
            if (!fullName.trim().contains(" ") || fullName.endsWith(" ")) {
                continue;
            } else {

                // firstname
                String capitalFirstname = fullName.substring(0,1).toUpperCase();
                String othersFullname = fullName.substring(1,fullName.indexOf(" ")).toLowerCase();
                String firstName = capitalFirstname + othersFullname;

                // lastname
                String lastName = fullName.substring(fullName.indexOf(" ")).toUpperCase();

                JOptionPane.showMessageDialog(null,
                        "Welcome, " + firstName + lastName);

                break;
            }
        }
    }
}
