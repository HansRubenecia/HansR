import java.util.Scanner;

public class Essay extends TestQuestion {

	    int numLines;     

	    public Essay() {
	        super();
	    }

	    @Override  
	    protected void readQuestion() {
	        	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter number of blank lines for essay:");
	        numLines = in.nextInt();
	        in.nextLine();
	        System.out.println("Enter the question, ending with a Period:");
	        testQuestion = in.nextLine();
	    }

	    @Override 
	    public String toString() {
	        String output = testQuestion;
	        
	        for (int i = 0; i < numLines; i++) {
	            output += "\n";
	        }
	        return output;
	    }

	}