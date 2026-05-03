package tests;

import static org.junit.jupiter.api.Assertions.*;
import java.util.regex.*;
import org.junit.jupiter.api.Test;

public class TestEmailValidator {

    private static final String EMAIL_REGEX =
            "^[A-Za-z0-9._+]+@[A-Za-z0-9]+(?:\\.[A-Za-z0-9]+)+$";

    @Test
    public void testValidEmails() {
        assertTrue(Pattern.matches(EMAIL_REGEX, "test@example.com"));
        assertTrue(Pattern.matches(EMAIL_REGEX, "test@stu.vistula.edu.pl"));
    }

    @Test
    public void testInvalidEmails() {
        assertFalse(Pattern.matches(EMAIL_REGEX, "test@examplecom"));
        assertFalse(Pattern.matches(EMAIL_REGEX, "test@vistula..pl"));
    }
}
