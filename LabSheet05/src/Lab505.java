import javax.swing.*;

public class Lab505 {

    // method for palindrome checking
    public static boolean is_palindrome(String word){
        word = word.toLowerCase();
        for (int i = 0 ; i <= word.length()/2 ; i++){
            if (word.charAt(i) == word.charAt(word.length() - 1 -i)){
                continue;
            } else
                return false;
        }
        return true;
    }

    // method main
    public static void main(String[] args){

        String word = JOptionPane.showInputDialog(null,
                "Enter some word:");

        boolean palindrome_check = is_palindrome(word);
        String palindrome_result = (palindrome_check)? " is Palindrome" : " is NOT Palindrome";
        JOptionPane.showMessageDialog(null,
                word + palindrome_result);
    }
}