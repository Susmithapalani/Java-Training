import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = s.nextInt();
        int number = num; 
        int reversedNumber = 0;
        while (num > 0) {
            int a = num % 10;
            reversedNumber = reversedNumber * 10 + a;
            num /= 10;
        }

        if (number == reversedNumber) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a Palindrome number");
        }
    }
}
