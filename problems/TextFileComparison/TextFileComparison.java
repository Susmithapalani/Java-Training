import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileComparison {

    public static void main(String[] args) {
        compareTextFiles("file1.txt", "file2.txt");
    }

    public static void compareTextFiles(String file1Path, String file2Path) {
        try (BufferedReader reader1 = new BufferedReader(new FileReader("C:\\Users\\ELCOT\\Desktop\\susmitha\\Java Training\\Filehandling\\Test.txt"));
             BufferedReader reader2 = new BufferedReader(new FileReader("C:\\Users\\ELCOT\\Desktop\\susmitha\\Java Training\\Filehandling\\Test.txt"))) {

            String line1 = reader1.readLine();
            String line2 = reader2.readLine();
            int lineNumber = 1;

            while (line1 != null || line2 != null) {
                if (line1 == null || !line1.equals(line2)) {
                    System.out.println("Difference found at line " + lineNumber + ":");
                    if (line1 != null)
                        System.out.println("File 1: " + line1);
                    else
                        System.out.println("File 1: <End of file>");
                    if (line2 != null)
                        System.out.println("File 2: " + line2);
                    else
                        System.out.println("File 2: <End of file>");
                    System.out.println();
                }

                line1 = reader1.readLine();
                line2 = reader2.readLine();
                lineNumber++;
            }

            System.out.println("Comparison completed.");

        } catch (IOException e) {
            System.err.println("Error reading files: " + e.getMessage());
        }
    }
}
