import java.util.Scanner;

public class ProductMain4 {

    // method ที่เอาข้อมูลจาก array ไปใส่เป็น object และ attribute ของ object
    public static void setting_product(Product... products) {
        String[] names = {"Pens", "Pencils", "Markers", "Highlighters"};
        double[] prices = {25.5, 17.25, 30, 35};
        int[] quantities = {20, 35, 10, 40};
        for (int i = 0; i < products.length; i++) {
            products[i] = new Product();
            products[i].name = names[i];
            products[i].price = prices[i];
            products[i].quantity = quantities[i];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product[] products = new Product[4];
        setting_product(products);

        System.out.println("Welcome to MINI SHOP!!");
        System.out.println("------------------------------------");
        System.out.println("Press 1 to buy Pens (items=" + products[0].quantity + ")" +
                "\nPress 2 to buy Pencils (items=" + products[1].quantity + ")" +
                "\nPress 3 to buy Markers (items=" + products[2].quantity + ")" +
                "\nPress 4 to buy Highlighters (items=" + products[3].quantity + ")");
        System.out.println("------------------------------------");

        // เลือกสินค้า
        Product product_select;
        System.out.print("Enter a number: ");
        int product_choice = sc.nextInt();
        while (product_choice < 1 || product_choice > 4) {
            System.out.print("Invalid number! Enter a number, again: ");
            product_choice = sc.nextInt();
        }
        System.out.println("------------------------------------");
        // กำหนดตัวแปรเพื่อรับ object ที่เลือก
        product_select = products[product_choice - 1];

        // ซื้อสินค้า + ลดจำนวน
        int buy_amount;
        System.out.print("How many " + product_select.name + " do you want to buy? ");
        buy_amount = sc.nextInt();

        if (buy_amount > product_select.quantity) {
            System.out.println("Not enough items in stock . . .\n");
        } else {
            // ลดจำนวนถ้ามีพอ
            System.out.println("sold " + buy_amount + " items");
            product_select.sell(buy_amount);
        }

        // แสดงข้อมูลสินค้าในคลัง
        product_select.showInfo();
    }
}