import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter Expression: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // Check for the presence of a semicolon at the end
        if (input.matches(".+;\\s*$")) {
            // Split the input by semicolons to separate statements
            String[] statements = input.split(";");

            for (String statement : statements) {
                // Remove leading and trailing whitespace
                statement = statement.trim();

                if (isValidDeclaration(statement)) {
                    System.out.println("Semantically Correct: " + statement);
                } else {
                    System.out.println("Semantically Incorrect: " + statement);
                }
            }
        } else {
            System.out.println("Invalid statement: Missing or misplaced semicolon");
        }
    }

    // Perform a basic semantic check for variable declaration
    public static boolean isValidDeclaration(String statement) {
        // Use a regular expression to match valid variable declarations like "int x;"
        String pattern = "^(int|String|float|char|long|byte|boolean|double)\\s+[a-zA-Z_][a-zA-Z0-9_]*;$";
        return Pattern.matches(pattern, statement);
    }
}
