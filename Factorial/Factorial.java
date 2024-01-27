import java.io.Console;

public class Factorial {
    public static void main(String[] args) {
        Console console = System.console();

        

        String input = console.readLine("Enter a number: ");
        int num;

        try {
            num = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            return;
        }

        if (num < 0) {
            System.out.println("Please enter a non-negative number.");
            return;
        }

        long result = calculateFactorial(num);
        System.out.println("The factorial of " + num + " is: " + result);
    }

    static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
