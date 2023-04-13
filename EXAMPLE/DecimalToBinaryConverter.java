import java.util.Scanner;

class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = sc.nextInt();

        String binaryNumber = "";
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binaryNumber = remainder + binaryNumber;
            decimalNumber /= 2;
        }

        System.out.println("Binary equivalent is " + binaryNumber);
   sc.close();
    }
}
