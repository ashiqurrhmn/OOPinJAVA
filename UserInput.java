import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.print("Are you a student (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        System.out.println("Student status: " + isStudent);

        System.out.print("Enter a small number (byte): ");
        byte smallNumber = scanner.nextByte();
        System.out.println("You entered: " + smallNumber);

        System.out.print("Enter a decimal number (double): ");
        double decimalNumber = scanner.nextDouble();
        System.out.println("You entered: " + decimalNumber);

        System.out.print("Enter a floating-point number (float): ");
        float floatNumber = scanner.nextFloat();
        System.out.println("You entered: " + floatNumber);

        System.out.print("Enter an integer: ");
        int integer = scanner.nextInt();
        System.out.println("You entered: " + integer);

        System.out.print("Enter a large number (long): ");
        long largeNumber = scanner.nextLong();
        System.out.println("You entered: " + largeNumber);

        System.out.print("Enter a small number (short): ");
        short shortNumber = scanner.nextShort();
        System.out.println("You entered: " + shortNumber);

        scanner.close();
    }
}
