import java.util.Scanner;

class SortDescArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
      int[] arr = new int[] {12, 45, 56, 54, 2};
        int temp = 0;
        
      
        System.out.print("Enter the index to remove: ");
        int indexToRemove = scanner.nextInt();
        
    
        System.out.print("Enter the new element to insert: ");
        int newElement = scanner.nextInt();
        
        
        for (int i = indexToRemove; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = newElement; 
        
      
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
   
        System.out.println("Elements of array in descending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        scanner.close();
    }
}
