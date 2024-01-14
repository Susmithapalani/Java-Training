class Averagenumbers {
    public static void main ( String [] args){
        int argslength = args.length;
        int total = 0;
        for (int i = 0; i<argslength;i++){
            total += Integer.parseInt(args[i]);
        }
        System.out.println("Average = " + total/args.length);
    }
}