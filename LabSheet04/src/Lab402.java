import javax.swing.*;

public class Lab402 {
    public static void main(String[] args) {
        String studentID;

        do{
            studentID = JOptionPane.showInputDialog(null,
                    "Enter student-id: ",
                    "Input",
                    JOptionPane.QUESTION_MESSAGE);
        } while (studentID.length() != 10);

        String majorID = studentID.substring(2,5);
        String major;

        switch (majorID){
            case "131":
                major = "Information Technology (IT)";
                break;
            case "132":
                major = "Multimedia Technology (MT)";
                break;
            case "133":
                major = "Digital Business Information Technology (BI)";
                break;
            case "134":
                major = "Digital Technology in Mass Communication (DC)";
                break;
            case "135":
                major = "Data Science and Data Analytics (DS)";
                break;
            default:
                major = "Cannot found major";
        }

        JOptionPane.showMessageDialog(null,
                "Student ID: "+studentID+"\nMajor: "+major);
    }
}
