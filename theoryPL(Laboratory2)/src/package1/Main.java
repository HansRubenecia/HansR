package package1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{

		String state = "q0";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		
        String input = sc.nextLine();
        for(int x = 0; x < input.length(); x++)
        {
            if(state.equals("q0") && input.charAt(x) == '0'  )
            {

                state = "q1";
            }
            else if(state.equals("q0") && input.charAt(x) == '1'  )
            {

                state = "q0";
            }
            else if(state.equals("q1") && input.charAt(x) == '0'  ){

            	
                state = "q1";
            }
            else if(state.equals("q1") && input.charAt(x) == '1'  )
            {

                state = "q2";
            }
            else if(state.equals("q2") && input.charAt(x) == '0'  )
            {

                state = "q1";
            }
            else if(state.equals("q2") && input.charAt(x) == '1'  )
            {

                state = "q0";
            }
            else{
                System.out.println("Invalid input.. Exiting automaton");
            }

        }
        //check if state is final state
        if(state.equals("q2")){
            System.out.println("String accepted");
        }else{
            System.out.println("String not accepted");
        }
    }


	

}
