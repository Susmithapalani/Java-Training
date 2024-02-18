public class UppercaseChecker {
    public static void main(String[] args) {
        char ch = 'A';
        boolean isUpperCase = Character.isUpperCase(ch);
        if (isUpperCase) {
            System.out.println(ch + " is an uppercase letter.");
        } else {
            System.out.println(ch + " is not an uppercase letter.");
        }
    }
}
