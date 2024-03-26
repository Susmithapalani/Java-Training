import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileComparator {

    public static void main(String[] args) {
        String file1Path = "file1.txt";
        String file2Path = "file2.txt";

        try {
            String file1Content = readFile("C:\\Users\\ELCOT\\Desktop\\susmitha\\Java Training\\problems\\FileComparator\\file1.txt");
            String file2Content = readFile("C:\\Users\\ELCOT\\Desktop\\susmitha\\Java Training\\problems\\FileComparator\\file2.txt");

            if (file1Content.equals(file2Content)) {
                System.out.println("Files are identical.");
            } else {
                System.out.println("Files are different.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }
        reader.close();
        return content.toString();
    }
}
