import java.util.Scanner;

public class Ex202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student-id : ");
        String id = scanner.next(); //อ่านถึงช่องว่าง แต่ไม่กิน newline (\n) \n จึงยังเหลืออยู่

        scanner.nextLine(); //กิน newline (\n) ที่เหลือมาจากบรรทัด 8
        System.out.print("Enter student-name : ");
        String name = scanner.nextLine();

        System.out.println("\nStudent-id : " + id);
        System.out.println("Student name: " + name);
    }
}
