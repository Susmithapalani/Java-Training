import java.io.Console;

public class MainMethods {
    int z[] = new int[4];

    int add(int a, int b) {
        int c = a + b;
        return c;
    }

    int sub(int a, int b) {
        int d = a - b;
        return d;
    }

    int multiply(int a, int b) {
        int e = a * b;
        return e;
    }

    int divide(int a, int b) {
        int f = a / b;
        return f;
    }

    public static void main(String[] args) {
        Console console = System.console();

        System.out.println("Enter number1:");
        int number1 = Integer.parseInt(console.readLine());

        System.out.println("Enter number2:");
        int number2 = Integer.parseInt(console.readLine());

        MainMethods m = new MainMethods();
        System.out.println("Addition: " + m.add(number1, number2));
        System.out.println("Subtraction: " + m.sub(number1, number2));
        System.out.println("Multiplication: " + m.multiply(number1, number2));
        System.out.println("Division: " + m.divide(number1, number2));
    }
}
