import java.io.Console;

public class MainSumDigits
{
    public static void main(String[] args) {
        Console console = System.console();


        String input = console.readLine("Enter a number: ");
        int number = Integer.parseInt(input);;


        int sum = calculateDigitSum(number);
        System.out.println("The sum of the digits of " + number + " is: " + sum);
    }

    static int calculateDigitSum(int num) {
        int sum = 0;

        while (num != 0) {
            sum += num % 10; 
            num /= 10;       
        }

        return sum;
    }
}
