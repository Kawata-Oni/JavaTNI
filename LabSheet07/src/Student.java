public class Student {

    // attribute
    String name;
    String id;
    int score = 0;

    // method
    public void doHomework(int point) {
        score += point;
        System.out.println(name + " did homework " + point + " points");
    }

    public void takeExam(int point) {
        score += point;
        System.out.println(name + " took exam " + point + "points");
    }

    public String getResult() {
        if (score >= 50)
            return "PASS";
        return "FAIL";

    }

    public void showStatus() {
        System.out.println("Name      : " + name +
                "\nStudent ID: " + id +
                "\nScore     : " + score +
                "\nResult    : " + getResult());
        System.out.println("---------------------------------");
    }
}
