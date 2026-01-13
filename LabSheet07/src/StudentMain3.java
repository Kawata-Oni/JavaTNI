import javax.swing.*;

public class StudentMain3 {
    public static void main(String[] args) {

        Student[] st = new Student[3];

        for(int i=0; i<st.length; i++) {

            st[i] = new Student(); // สร้าง object

            st[i].name = JOptionPane.showInputDialog("Enter student id " + (i+1));
            st[i].id = JOptionPane.showInputDialog("Enter student name " + (i+1));

            st[i].doHomework(Integer.parseInt(JOptionPane.showInputDialog("Enter homework score " + (i+1))));
            st[i].takeExam(Integer.parseInt(JOptionPane.showInputDialog("Enter exam score " + (i+1))));

            System.out.println();
            st[i].showStatus();
        }
    }
}
