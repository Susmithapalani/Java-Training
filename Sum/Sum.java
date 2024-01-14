class Sum {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide exactly two numbers as command line arguments.");
            return;
        }

        int total = 0;
        for (int i = 0; i < args.length; i++) {
            total += Integer.parseInt(args[i]);
        }

        System.out.println("Sum = " + total);
    }
}
