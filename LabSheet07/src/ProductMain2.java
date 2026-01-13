import java.util.Scanner;

public class ProductMain2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // กำหนด attribute
        Product product1 = new Product();
        product1.name = "Pens";
        product1.price = 10.5;
        product1.quantity = 50;

        Product product2 = new Product();
        product2.name = "Notebooks";
        product2.price = 25.75;
        product2.quantity = 20;

        // เลือกสินค้า
        System.out.println("Welcome to Mini Shop");
        System.out.println("-----------------------------");
        System.out.println("Press [1] to buy Pen");
        System.out.println("Press [2] to buy Notebook");

        Product product_select;
        System.out.print("Enter a number: ");
        String product_choice = sc.nextLine();
        while (!product_choice.equals("1") && !product_choice.equals("2")) {
            System.out.print("Invalid number! Enter a number, again: ");
            product_choice = sc.nextLine();
        }
        if (product_choice.equals("1")) {
            product_select = product1;
        } else {
            product_select = product2;
        }

        // แสดงข้อมูลสินค้าที่เลือก
        product_select.showInfo();
        System.out.println("-----------------------------");

        // ซื้อสินค้า + ลดจำนวน
        int buy_amount;
        System.out.print("How many " + product_select.name + " do you want to buy? ");
        buy_amount = sc.nextInt();
        System.out.println("sold " + buy_amount + " items");
        product_select.sell(buy_amount);
        System.out.println("-----------------------------");

        product_select.showInfo();
    }
}