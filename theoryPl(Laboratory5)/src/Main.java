import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		
		System.out.print("Enter Expression: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		Lex lex =new Lex();
		lex.Analysis(input);
		
		String value = lex.getValue();
		System.out.println(value);
		String dataType = lex.getDataType();
		
			if(value == null)
			{
				System.out.println("Semantically Correct!");
			}
			else if(dataType.equals(value))
			{
				System.out.println("Semantically Correct!");
			}
			else if(dataType.equals("int") && (Long.parseLong(value) >= -Integer.MIN_VALUE && Long.parseLong(value)<= Integer.MAX_VALUE ))
			{
				System.out.println("Semantically Correct!");
			}
			else if(dataType.equals("long") && (Long.parseLong(value) >= Long.MIN_VALUE && Long.parseLong(value) <= Long.MAX_VALUE ))
			{
				System.out.println("Semantically Correct!");
			}
			else if(dataType.equals("float") && (Long.parseLong(value) >= Float.MIN_VALUE && Long.parseLong(value) <= Float.MAX_VALUE))
			{
				System.out.println("Semantically Correct!");
			}
			else if(dataType.equals("double") && (Double.parseDouble(value) >= Double.MIN_VALUE && Double.parseDouble(value) <= Double.MAX_VALUE))
			{
				System.out.println("Semantically Correct!");
			}
			else if(dataType.equals("byte") && (Byte.parseByte(value) >= Byte.MIN_VALUE && Byte.parseByte(value) <= Byte.MAX_VALUE))
			{
				System.out.println("Semantically Correct!");
			}
			else if(dataType.equals("short") && (Short.parseShort(value) >= Short.MIN_VALUE && Short.parseShort(value) <= Short.MAX_VALUE))
			{
				System.out.println("Semantically Correct!");
			}
			else 
			{
				System.out.println("Semantically Incorrect!");
			}
			/* test input
			 1) int x = 1;
			 2) String str = "Hello World";
			 3) double number;
			 */

		

	}

}
