Regular Expressions – Java Lab Assignment:

Regular expressions are important because they let you quickly and accurately find, validate, and extract patterns in text without writing long manual code.

This repository contains two Java tasks focused on applying regular expressions and validating functionality through JUnit testing. The project demonstrates practical use of pattern matching, file processing, and automated test design.

Task 1 — Email Validation:

Implements a regular expression–based validator for email addresses.

-Uses Pattern and Matcher to check email format correctness.

-Includes JUnit tests covering valid and invalid email cases.

-Ensures deterministic and reproducible validation logic.

<img width="1074" height="364" alt="Screenshot 2026-05-04 005653" src="https://github.com/user-attachments/assets/b4ecd656-5b46-4ba2-9db0-4a304021e219" />


Task 2 — Grade Filtering:

Processes a text file containing student names and grades, extracting only the entries that include grade 5.

-Implements filterStudentsWithGrade5(File input, File output) as a callable method.

-Uses a regular expression instead of direct string comparison.

-Writes filtered results to an output file.

-Includes JUnit tests using temporary files to verify correctness.

<img width="899" height="419" alt="Screenshot 2026-05-04 005733" src="https://github.com/user-attachments/assets/595d0b03-9629-4322-bd3b-20cebe81a824" />


🧪 How to Run Tests
To execute the JUnit tests included in this project:

1-Open the project in IntelliJ IDEA (or any Java‑compatible IDE).

2-Ensure that JUnit 5 is correctly configured in the project’s classpath.

3-Navigate to the tests directory under src.

4-Right‑click on either:

-TestEmailValidator.java,

-TestGradeFilter.java,

-or the entire tests folder.

5-Select Run Tests (or Run 'All Tests').

All tests should pass successfully, confirming the correctness of the regex logic and file‑processing methods.

Technologies Used:

-Java

-Regular Expressions

-JUnit
