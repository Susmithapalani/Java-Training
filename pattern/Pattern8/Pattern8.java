public class Pattern8 {
    public static void main(String[] args) {
        String a = "SUSMITHA";
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a.charAt(j));
            }
System.out.println(); 
        }
    }
}
