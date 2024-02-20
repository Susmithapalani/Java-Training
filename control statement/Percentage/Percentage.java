public class Percentage {
    public static void main(String[] args) {
        double percentage = 78.5;
        
        char grade;
        
    
        if (percentage >= 90.0) {
            grade = 'A';
        } else if (percentage >= 80.0) {
            grade = 'B';
        } else if (percentage >= 70.0) {
            grade = 'C';
        } else if (percentage >= 60.0) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}
