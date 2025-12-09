import java.util.Scanner;

public class Lab405 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input some sentence: ");
        String sentence = scanner.nextLine();
        while (!sentence.endsWith(".")) {
            System.out.print("The sentence must end with full stop point: ");
            sentence = scanner.nextLine();
        }

        String[] words = sentence.split("\\s+");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
