import java.util.Arrays;

public class sortedArray {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 1, 9, 3}; 
        
        Arrays.sort(numbers);
        
        System.out.print("Sorted array in ascending order: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
