import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter token: ");
		String input = sc.nextLine();
		
		input = input.trim().replaceAll(" ", "");
		String[] inputSplit = input.split(">");
		String output = "";
		
		for (String a : inputSplit)
		{
			output += a + ">";
		}
		if(output.equals("<data_type><identifier><delimiter>")||output.equals("<data_type><identifier><assignment_operator><value><delimiter>"))
		{
			System.out.println("Syntax is Correct!");
		}
		else
		{
			System.out.println("Syntax is Incorrect!");
		}
		/*input test
		<data_type> <identifier> <assignment_operator> <value> <delimiter>
		<data_type> <value> <delimiter>
		<data_type> <identifier> <delimiter>*/

		
	}
	
}