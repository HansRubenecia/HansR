import java.util.*;

public class MultiChoice extends TestQuestion {

    public String[] choices;
    public int numChoices;
  

    public MultiChoice() {
        super();
    }

    @Override
    public void readQuestion() {
        Scanner in = new Scanner(System.in);
        System.out.println("How many choices will this question have?");
        numChoices = in.nextInt();
        in.nextLine();
        
        choices = new String[numChoices];
        System.out.println("Enter the question text:");
        testQuestion =in.nextLine();
        
        for (int i = 0; i < numChoices; i++) {
            System.out.println("Enter the choice " + i + ":");
            choices[i] = in.nextLine();
        }

    }

    @Override
    public String toString() {
        String output;
        output = testQuestion;
        char charo = 'A';
        for (int i = 0; i < numChoices; i++) {

            output += ("\n" + charo + ": " + choices[i]);
            charo = (char) ((int) charo + 1);
        }
        return output;
    }

}