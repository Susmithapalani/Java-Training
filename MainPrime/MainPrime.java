import java.io.Console;

public class MainPrime {
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.out.println("Console is not available. Exiting...");
            return;
        }

        String input = console.readLine("Enter a number: ");
        int number;

        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            return;
        }

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }


    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
