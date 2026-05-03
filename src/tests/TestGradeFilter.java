import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestGradeFilter {

    private File inputFile;
    private File outputFile;

    @BeforeEach
    public void setup() throws IOException {
        inputFile = File.createTempFile("students", ".txt");
        outputFile = File.createTempFile("result", ".txt");

        Files.write(inputFile.toPath(),
                ("Sueda 4\n" +
                        "Maciej 5\n" +
                        "Sena 5\n" +
                        "Alicja 3\n").getBytes()
        );
    }

    @Test
    public void testFilterStudentsWithGrade5() throws IOException {
        GradeFilter.filterStudentsWithGrade5(inputFile, outputFile);

        String result = Files.readString(outputFile.toPath());
        System.out.println("OUTPUT:\n" + result);

        assertEquals("Maciej 5" + System.lineSeparator() +
                        "Sena 5" + System.lineSeparator(),
                result
        );

    }

}
