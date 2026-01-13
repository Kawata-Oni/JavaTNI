import javax.swing.JOptionPane;

public class ProductMain {

    public static void main(String[] args) {

        Product product = new Product();
        // รับค่า attribute ผ่าน JOptionPane
        product.name = JOptionPane.showInputDialog("Enter product name:");

        String inputPrice = JOptionPane.showInputDialog("Enter product price per item:");
        product.price = Double.parseDouble(inputPrice); // แปลง String เป็น double

        String inputQty = JOptionPane.showInputDialog("Enter product stock:");
        product.quantity = Integer.parseInt(inputQty); // แปลง String เป็น int

        // แสดงข้อมูล
        product.showInfo();

        // เพิ่มจำนวน
        int addConfirm = JOptionPane.showConfirmDialog(null, "Do you want to add more item?");
        if (addConfirm == JOptionPane.YES_OPTION) {
            int amount = Integer.parseInt(JOptionPane.showInputDialog("How many items to add in stock?"));
            product.addStock(amount); // เรียกใช้ Method จากคลาส Product
            System.out.println("\nAdded " + amount + " Items to stock");
        }

        // เปลี่ยนราคา
        int priceConfirm = JOptionPane.showConfirmDialog(null, "Do you want to change price?");
        if (priceConfirm == JOptionPane.YES_OPTION) {
            double newPrice = Double.parseDouble(JOptionPane.showInputDialog("How much is the new price per item?"));
            product.changePrice(newPrice); // เรียกใช้ Method จากคลาส Product
            System.out.println("Change price to " + newPrice + " Baht\n");
        }

        // แสดงข้อมูล
        product.showInfo();
    }
}