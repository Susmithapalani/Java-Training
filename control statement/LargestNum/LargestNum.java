public class LargestNum {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 17;
        int num3 = 32;
        
        int largest;
        largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        
        if (num3 > largest) {
            largest = num3;
        }
        
        System.out.println("The largest among " + num1 + ", " + num2 + ", and " + num3 + " is: " + largest);
    }
}
