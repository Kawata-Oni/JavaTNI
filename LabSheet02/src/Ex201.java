import java.text.DecimalFormat;

public class Ex201 {
    public static void main(String[] args) {
        DecimalFormat frm = new DecimalFormat("#,###.00");

        String productId = "PB-001";
        String productName = "Pencil Box";
        int productItem = 112;
        double pricePerItem = 30.20;

        double totalPrice = productItem*pricePerItem;

        System.out.println("Product name: " + productName + " (" + productId + ")");
        System.out.println("Product item: " + productItem + " (" + frm.format(pricePerItem) + " baht/piece)");
        System.out.println("Total price : " + frm.format(totalPrice) + " baht");
    }
}
