import java.io.*;
import java.util.regex.*;

public class GradeFilter {

    public static void filterStudentsWithGrade5(File inputFile, File outputFile) throws IOException {

        Pattern pattern = Pattern.compile(".*5.*");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;

            while ((line = reader.readLine()) != null) {
                if (pattern.matcher(line).matches()) {
                    writer.write(line);
                    writer.newLine();
                }
            }
        }
    }
}
