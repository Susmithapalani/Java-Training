import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student {
    private String name;
    private Map<String, Double> assignmentScores;

    public Student(String name) {
        this.name = name;
        this.assignmentScores = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addAssignmentScore(String assignmentName, double score) {
        assignmentScores.put(assignmentName, score);
    }

    public Map<String, Double> getAssignmentScores() {
        return assignmentScores;
    }
}

class Assignment {
    private String name;

    public Assignment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class GradebookManager {
    private List<Student> students;
    private List<Assignment> assignments;

    public GradebookManager() {
        this.students = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    public void recordGrade(Student student, String assignmentName, double score) {
        student.addAssignmentScore(assignmentName, score);
    }

    public double calculateAverageGrade(Student student) {
        double totalScore = 0;
        Map<String, Double> assignmentScores = student.getAssignmentScores();
        for (double score : assignmentScores.values()) {
            totalScore += score;
        }
        return totalScore / assignmentScores.size();
    }

    public void generateReport() {
        for (Student student : students) {
            System.out.println("Student: " + student.getName());
            Map<String, Double> assignmentScores = student.getAssignmentScores();
            for (String assignmentName : assignmentScores.keySet()) {
                System.out.println("Assignment: " + assignmentName + ", Score: " + assignmentScores.get(assignmentName));
            }
            System.out.println("Average Grade: " + calculateAverageGrade(student));
            System.out.println();
        }
    }
}

public class AssignmentTask {
    public static void main(String[] args) {
        GradebookManager gradebookManager = new GradebookManager();

        Student student1 = new Student("Susmi");
        Student student2 = new Student("Susmitha");

        Assignment assignment1 = new Assignment("Science Homework 1");
        Assignment assignment2 = new Assignment("Science Homework 2");

        gradebookManager.addStudent(student1);
        gradebookManager.addStudent(student2);

        gradebookManager.addAssignment(assignment1);
        gradebookManager.addAssignment(assignment2);

        gradebookManager.recordGrade(student1, assignment1.getName(), 85);
        gradebookManager.recordGrade(student1, assignment2.getName(), 90);

        gradebookManager.recordGrade(student2, assignment1.getName(), 75);
        gradebookManager.recordGrade(student2, assignment2.getName(), 80);

        gradebookManager.generateReport();
    }
}
