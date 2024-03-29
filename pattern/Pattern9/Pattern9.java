public class Pattern9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) { // Outer loop for rows, runs from 1 to 7
            for (int j = 1; j <= i; j++) { 
                System.out.print(j + " "); 
            }
            System.out.println(); 
        }
    }
}
