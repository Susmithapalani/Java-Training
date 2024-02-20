public class Max {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        int c = 17;
        
        int max = a;
        if (b > max) {
            max = b;
        }
        
        if (c > max) {
            max = c;
        }
        
        System.out.println("The maximum of " + a + ", " + b + ", and " + c + " is: " + max);
    }
}
