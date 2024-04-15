public class Patternalaphabet {
    public static void main(String[] args) {
        int n = 5; 
for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.print((char) ('A' + i - 1));
            for (int j = 1; j <= 2 * i - 3; j++) {
                System.out.print(" ");
            }
            if (i != 1)
                System.out.print((char) ('A' + i - 1));

            System.out.println();
        }
    }
}
