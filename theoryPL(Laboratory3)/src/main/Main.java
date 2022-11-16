package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter Source Language: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		if(input.contains(";"))
		{
			input = input.replace(";"," ;");
		}
		
		String[] inputSplit= input.split(" ");
		
		
		List <String> stringList= new ArrayList<String>();
		String qoute = "";
		String token = "";
		int num = 0;
		
		for (String a : inputSplit)
		{
		
			if(a.charAt(0) ==('\"') || a.charAt(0) ==('\''))
			{
				qoute += a;
			}
			else if(a.charAt(a.length()-1) == '\"'|| a.charAt(a.length()-1) ==('\''))
			{
				qoute += a;
				stringList.add(qoute);
			}
			else
			{
				stringList.add(a);
			}
		}
		ArrayList<String> tokenList= new ArrayList<String>();
		for(String a : stringList) 
		{
			if(a.equals("int")|| a.equals("double")|| a.equals("String")||a.equals("char"))
			{
				token ="<data_type>";
				tokenList.add(token);
			}
			else if(a.equals("="))
			{
				token ="<assignment_operator>";
				tokenList.add(token);
			}
			else if(a.contains("\"")||a.contains("\'"))
			{
				token ="<value>";
				tokenList.add(token);
			}
			else if(a.equals(";"))
			{
				token = "<delimiter>";
				tokenList.add(token);
			}
			else
			{
				if(token =="<identifier>")
				{
					token ="<identifier>";
				}
				else
				{
					token ="<identifier>";
					tokenList.add(token);	
				}
				
			}
		}
		
		String LexemesOutput = "";
		for(String a : tokenList)
		{
			System.out.print(a + " ");
		}
		
		 
	}
}
		
	



