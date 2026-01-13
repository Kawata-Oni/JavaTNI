public class Product {

    // attribute
    String name;
    double price;
    int quantity;

    // method สร้าง object
    public Product() {
    }

    // Method เพิ่มจำนวนสินค้า
    public void addStock(int amount) {
        quantity += amount;
    }

    // Method เปลี่ยนราคาสินค้า
    public void changePrice(double newPrice) {
        price = newPrice;
    }

    // Method แสดง attribute
    public void showInfo() {
        System.out.println("Name  : " + name +
                "\nPrice : " + price + " Baht/Item" +
                "\nStock : " + quantity + " Items" +
                "\nStock Value : " + (price * quantity) + " Baht");
    }

    // Method ลดจำนวนใน stock
    public void sell(int buy_amount) {
        quantity -= buy_amount;
    }
}