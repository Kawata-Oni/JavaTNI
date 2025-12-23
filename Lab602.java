import java.util.Scanner;

public class Lab602 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] movie_list = {"Me Before You", "Titanic",
                "Before Sunrise", "The Holiday", "A Walk to Remember"};
        double[] score_list = {4.2, 4.9, 4.4, 3.7, 4.3};
        System.out.print("Enter a movie title: ");
        String movie = scanner.nextLine();


        boolean isFound = false;

        for (int i = 0; i < movie_list.length; i++) {
            if (movie_list[i].equalsIgnoreCase(movie)) {
                System.out.println("\nThe rating score of \"" + movie_list[i] + "\" is " + score_list[i]);
                isFound = true;
                int rank = find_rank(score_list[i], score_list);
                System.out.println("This movie is ranked number " + rank);
                break;
            }
        }

        if (!isFound) {
            System.out.println("\nCannot found this movie title...");
        }
    }

    /////////////////////////////////////////

    public static int find_rank(double target_score, double[] all_scores) {
        int rank = 1;

        for (double score : all_scores) {
            if (score > target_score) {
                rank++;
            }
        }
        return rank; // ส่งค่าอันดับกลับไปที่ main
    }
}