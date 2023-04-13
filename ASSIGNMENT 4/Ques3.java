import java.lang.String;

public class Ques3 {
    public static void main(String[] args) {
        String s1 = "KIIT University";
        System.out.println("Original string: " + s1);

        // Tokenize the string into words
        String[] words = s1.split(" ");
        if (words.length == 2) {
            String firstWord = words[0];
            String secondWord = words[1];
            System.out.println("First word: " + firstWord);
            System.out.println("Second word: " + secondWord);
        } else {
            System.out.println("Input string does not contain exactly 2 words.");
        }
    }
}
