import java.util.Scanner;

public class Lab405 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = "";

        while (sentence.endsWith(".") == false) {
            System.out.print("Input some sentence: ");
            sentence = scanner.nextLine();
            if (sentence.endsWith(".")){
                break;
            } else {
                System.out.print("The sentence must end with full stop point: ");
                sentence = scanner.nextLine();
            }
        }


        String[] words = sentence.split("\\s+");
        for (String eachWord : words){
            System.out.println(eachWord);
        }
        scanner.close();

    }
}
