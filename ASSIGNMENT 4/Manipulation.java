public class Manipulation {
    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("Please provide a string as a command line argument.");
        } else {
            String inputString = args[0];
            System.out.println("Input string: " + inputString);
            System.out.println("Length of the string: " + inputString.length());

            System.out.println("Characters of the string:");
            for (int i = 0; i < inputString.length(); i++) {
                char c = inputString.charAt(i);
                System.out.println(c);
            }

            System.out.println("String with character case conversion:");
            StringBuilder convertedString = new StringBuilder();
            for (int i = 0; i < inputString.length(); i++) {
                char c = inputString.charAt(i);
                if (Character.isLowerCase(c)) {
                    convertedString.append(Character.toUpperCase(c));
                } else if (Character.isUpperCase(c)) {
                    convertedString.append(Character.toLowerCase(c));
                } else {
                    convertedString.append(c);
                }
            }
            System.out.println(convertedString.toString());
        }
    }
}