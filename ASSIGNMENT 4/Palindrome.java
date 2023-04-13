import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString;
        System.out.println("Enter a string:");
        inputString = sc.next();
        System.out.println("Input string: " + inputString);
        boolean isPalindrome = isPalindrome(inputString);
        if (isPalindrome) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
        sc.close();
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
