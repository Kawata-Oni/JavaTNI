import javax.swing.*;

public class Lab309 {
    public static void main(String[] args) {
        /////////////////////////////////////

        int order_menu_choice;
        int menu_number;

        do {
            int total_price = 0;
            order_menu_choice = JOptionPane.showConfirmDialog(null,
                    "Do you want to order menu?",
                    "Yakitori Shop",
                    JOptionPane.YES_NO_OPTION);
            if (order_menu_choice == JOptionPane.YES_OPTION) {
                do {
                    menu_number = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Yakitori Menu" +
                                    "\n[1] Chicken Wing 99 B." +
                                    "\n[2] Pork with Leek 89 B." +
                                    "\n[3] Beef Tongue 109 B." +
                                    "\n[0] Exit and Calculate" +
                                    "\nEnter menu number",
                            "Input",
                            JOptionPane.QUESTION_MESSAGE));
                    switch (menu_number) {
                        case 1:
                            total_price += 99;
                            break;
                        case 2:
                            total_price += 89;
                            break;
                        case 3:
                            total_price += 109;
                            break;
                        default:
                    }
                } while (menu_number != 0);
                JOptionPane.showMessageDialog(null, "Total price is " + total_price + " Baht.");
            } else
                break;
        } while (order_menu_choice == JOptionPane.YES_OPTION);

        ////////////////////////////////////SS
    }
}