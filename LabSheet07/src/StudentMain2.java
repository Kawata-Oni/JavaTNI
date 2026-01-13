import java.util.Scanner;

public class StudentMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] st = new Student[10];

        for(int i=0; i<st.length; i++) {

            st[i] = new Student(); // สร้าง object

            System.out.print("Enter student name  : ");
            st[i].name = sc.next();
            System.out.print("Enter student id    : ");
            st[i].id = sc.next();

            System.out.print("Enter homework score:");
            st[i].doHomework(sc.nextInt()); // รับค่าแล้วส่งไปทำงานใน doHomework ทันที
            System.out.print("Enter exam score    :");
            st[i].takeExam(sc.nextInt());

            System.out.println();
            st[i].showStatus();
        }
    }
}
