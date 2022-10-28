import java.io.IOException;
import java.util.*;

public class WriteTest {

    public static void main(String[] args) throws IOException {
     
        int numOfQuestions; 
        char type;           

        TestQuestion[] midterm = new TestQuestion[100];
        
      
        ArrayList<TestQuestion> term = new ArrayList();

        
         Scanner scan = new Scanner(System.in);
         
        System.out.println("How many questions?");
        
        numOfQuestions = scan.nextInt();

        for (int i = 1; i <= numOfQuestions; i++) {
            
            System.out.println("Enter type of question number "+i+"  e for essay, m for multiple choice:");
           
            type = scan.next().charAt(0);

            if (type == 'e') {
                Essay essay = new Essay();
                essay.readQuestion();
                midterm[i] = essay;
            } else if (type == 'm') {
               
                MultiChoice multchoix = new MultiChoice();
                multchoix.readQuestion();
                midterm[i] = multchoix;
            }
            
            term.add(midterm[i]);

        }
        System.out.println();
        System.out.println();
        System.out.println("Here's the test:");

        for (TestQuestion term1 : term) {
            System.out.println(term1.toString());
        }   
     

    }
}