public class ProductMain3 {

    // method ที่เอาข้อมูลจาก array ไปใส่เป็น object และ attribute ของ object
    public static void setting_product(Product... products) {
        String[] names = {"Pens", "Pencils", "Markers", "Highlighters"};
        double[] prices = {25.5, 17.25, 30, 35};
        int[] quantities = {20, 35, 10, 40};
        for (int i=0; i<products.length; i++) {
            products[i] = new Product();
            products[i].name = names[i];
            products[i].price = prices[i];
            products[i].quantity = quantities[i];
        }
    }

    public static void main(String[] args) {
        // มี object 4 ชิ้นใน array ของ class Product
        Product[] products = new Product[4];

        // ส่ง "มี object 4 ชิ้น" เข้าไปใน method setting_product
        setting_product(products);

        // เพื่อแสดงรายการสินค้าทั้งหมด
        for (Product p : products) {
            double stock_value = p.price * p.quantity; // คำนวณราคารวมในคลัง

            System.out.println("Name  : " + p.name);
            System.out.println("Price : " + p.price + " Baht/Item");
            System.out.println("Stock : " + p.quantity + " Items");
            System.out.println("Stock Value: " + stock_value + " Baht");
            System.out.println("------------------------------------");
        }
    }
}