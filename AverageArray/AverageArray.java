class AverageArray {
    public static void main(String[] args) {
        int[] array = {3, 7, 1, 9, 5};

        int length = array.length;
        int sum = 0;
        
        for (int i = 0; i < length; i++) {
            sum += array[i];
        }

        double average = (double) sum / length;

        System.out.println("Average of array: " + average);
    }
}
