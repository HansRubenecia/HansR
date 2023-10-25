import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter Expression: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // Split the input by semicolons to separate statements
        String[] statements = input.split(";");

        for (String statement : statements) {
            // Split each statement into tokens by whitespace
            String[] tokens = statement.trim().split("\\s+");

            if (tokens.length >= 4 && tokens[2].equals("=")) {
                String dataType = tokens[0];
                String variableName = tokens[1];
                String assignmentOperator = tokens[2];
                String value = tokens[3];

                if (isValidAssignment(dataType, variableName, value)) {
                    System.out.println("Semantically Correct: " + statement);
                } else {
                    System.out.println("Semantically Incorrect: " + statement);
                }
            } else {
                System.out.println("Invalid statement: " + statement);
            }
        }
    }

    // Perform a more comprehensive semantic check
    public static boolean isValidAssignment(String dataType, String variableName, String value) {
        if (variableName.matches("[a-zA-Z_][a-zA-Z0-9_]*")) {
            try {
                if (dataType.equals("int")) {
                    int intValue = Integer.parseInt(value);
                    return true;
                } else if (dataType.equals("double")) {
                    double doubleValue = Double.parseDouble(value);
                    return true;
                } else if (dataType.equals("float")) {
                    float floatValue = Float.parseFloat(value);
                    return true;
                } else if (dataType.equals("char") && value.matches("'.'")) {
                    char charValue = value.charAt(1);
                    return true;
                } else if (dataType.equals("boolean")) {
                    if (value.equals("true") || value.equals("false")) {
                        return true;
                    }
                }
                // Handle other data types and checks here
            } catch (NumberFormatException e) {
                // If parsing as the specified data type fails, it's an invalid assignment
                return false;
            }
        }
        return false;
    }
}
