public class HypotenuseCalculator {
    public static void main(String[] args) {
        double a = 3.0;
        double b = 4.0;
        double hypotenuse = Math.sqrt(a * a + b * b);
        System.out.println("The hypotenuse of the right triangle with legs " + a + " and " + b + " is: " + hypotenuse);
    }
}
