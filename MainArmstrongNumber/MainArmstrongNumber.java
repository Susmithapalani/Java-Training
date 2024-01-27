import java.io.Console;

public class MainArmstrongNumber {
    public static void main(String[] args) {
        Console console = System.console();
        String input = console.readLine("Enter a number: ");
        int number;

        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            return;
        }

        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    static boolean isArmstrongNumber(int num) {
        int originalNumber = num;
        int numberOfDigits = countDigits(num);
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        return originalNumber == sum;
    }

    static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
