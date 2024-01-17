class MinMaxValues {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide at least two numbers as command line arguments.");
            return;
        }

        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[0]);

        for (int i = 1; i < args.length; i++) {
            int currentNumber = Integer.parseInt(args[i]);
            if (currentNumber < min) {
                min = currentNumber;
            } else if (currentNumber > max) {
                max = currentNumber;
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
