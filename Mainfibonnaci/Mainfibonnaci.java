import java.io.Console;
public class Mainfibonnaci
{
    public static void main(String[] args) {
        Console console = System.console();

        String input = console.readLine("Enter the value of N: ");
        int n = Integer.parseInt(input);

        int result = fibonacci(n);
        System.out.println("The " + n + "th number in the Fibonacci series is: " + result);
    }

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
    