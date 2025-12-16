import java.util.Scanner;

public class Lab503 {

    // method นับจำนวนสระ
    public static int count_vowel(String message, char letter){
        int char_appear = 0;
        for (int i = 0 ; i<message.length() ; i++){
            if (Character.toLowerCase(message.charAt(i)) == Character.toLowerCase(letter))
                char_appear +=1;
        }
        return char_appear;
    }

    // method main
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String message = scanner.nextLine();
        System.out.println("List of vowel in \"" + message + "\"");

        int char_A = count_vowel(message,'A');
        int char_E = count_vowel(message,'E');
        int char_I = count_vowel(message,'I');
        int char_O = count_vowel(message,'O');
        int char_U = count_vowel(message,'U');
        System.out.println("The letter 'A' appears " + char_A + " time(s)" +
                "\nThe letter 'E' appears " + char_E + " time(s)" +
                "\nThe letter 'I' appears " + char_I + " time(s)" +
                "\nThe letter 'O' appears " + char_O + " time(s)" +
                "\nThe letter 'U' appears " + char_U + " time(s)");
    }
}