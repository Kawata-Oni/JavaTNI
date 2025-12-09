import javax.swing.JOptionPane;

public class Lab401 {

    public static void main(String[] args) {
        String fullNameInput = null;
        String formattedFullName = null;

        while (formattedFullName == null) {

            fullNameInput = JOptionPane.showInputDialog(
                    null,
                    "Enter your full name:",
                    "Input",
                    JOptionPane.QUESTION_MESSAGE
            );

            if (fullNameInput == null) {
                JOptionPane.showMessageDialog(
                        null,
                        "Operation cancelled.",
                        "Information",
                        JOptionPane.INFORMATION_MESSAGE
                );
                return;
            }

            String trimmedInput = fullNameInput.trim();

            if (trimmedInput.isEmpty() || !trimmedInput.contains(" ")) {

                JOptionPane.showMessageDialog(
                        null,
                        "Invalid format: Please enter a full name (First Name and Last Name) separated by a space.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
                continue;
            }

            String cleanedName = trimmedInput.toLowerCase();

            int lastSpaceIndex = cleanedName.lastIndexOf(' ');
            String firstNamePart = cleanedName.substring(0, lastSpaceIndex).trim();
            String lastNamePart = cleanedName.substring(lastSpaceIndex + 1).trim();

            StringBuilder sb = new StringBuilder();
            for (String part : firstNamePart.split(" ")) {
                if (!part.isEmpty()) {
                    String capPart = part.substring(0, 1).toUpperCase() +
                            part.substring(1).toLowerCase();
                    sb.append(capPart).append(" ");
                }
            }
            String formattedFirstName = sb.toString().trim();

            String formattedLastName = lastNamePart.toUpperCase();

            formattedFullName = formattedFirstName + " " + formattedLastName;
        }

        String message = "Welcome, " + formattedFullName;
        JOptionPane.showMessageDialog(
                null,
                message,
                "Message",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}