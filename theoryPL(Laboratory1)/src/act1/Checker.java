package act1;

public class Checker 
{
	String reverseString = "";
	char[] currentChar;
	
	
	public void palindromeChecker(String currentWord)
	{
		String formattedWord = currentWord.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		currentChar = formattedWord.toCharArray();
		for(int i = currentChar.length-1; i>=0; i--)
		{
			reverseString += currentChar[i];
		}
		if(reverseString.equals(formattedWord)) 
		{
			System.out.println(currentWord + " is a palindrome");
		}
		else
		{
			System.out.println(currentWord + " is NOT a palindrome");
		}
	}
}
