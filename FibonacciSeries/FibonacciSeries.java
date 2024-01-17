class FibonacciSeries {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide a single integer as the limit for the Fibonacci series.");
            return;
        }
            int limit = Integer.parseInt(args[0]);
            if (limit < 0) {
                System.out.println("Please provide a non-negative integer as the limit.");
            }
            int a = 0, b = 1;
            System.out.println("Fibonacci Series up to " + limit + ":");
            do {
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
            } while (a <= limit);

        }
        }
    
