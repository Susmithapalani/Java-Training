import java.io.Console;

public class MainPerfectNumber {
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

        if (number < 1) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }

    static boolean isPerfectNumber(int num) {
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }
}
