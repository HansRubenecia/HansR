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
		int num = 0;
		
		for (String a : inputSplit)
		{
		
			if(a.charAt(0) ==('\"'))
			{
				qoute += a;
			}
			else if(a.charAt(a.length()-1) == '\"')
			{
				qoute += a;
				stringList.add(qoute);
			}
			else
			{
				stringList.add(a);
			}
		}
		
		for(String a : stringList) 
		{
			if(a.equals("int")|| a.equals("double")|| a.equals("String")||a.equals("char"))
			{
				System.out.print("<data_type>");
			}
			else if(a.equals("="))
			{
				System.out.print("<assignment_operator>");
			}
			else if(a.contains("\""))
			{
				System.out.print("<value>");
			}
			else if(a.equals(";"))
			{
				System.out.print("<delimiter>");
			}
			else
			{
				System.out.print("<identifier>");
			}
		}
		
			
		
	}
		
	
		
		
}

		
	



