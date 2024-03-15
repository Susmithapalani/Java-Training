import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = s.nextInt();

        if (isFibonacci(num)) {
            System.out.println("Fibonacci number");
        } else {
            System.out.println("Not a Fibonacci number");
        }
    }
    public static boolean isFibonacci(int num) {
        int a = 0, b = 1;
        while (a <= num) {
            if (a == num) {
                return true;
            }
            int temp = b;
            b += a;
            a = temp;
        }
        return false;
    }
}
