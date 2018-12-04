package derivative;

import java.util.Scanner;

public class Driver 
{

	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Function:");
		
		String input = kb.nextLine();
		
		Function function = TermInterface.parser(input);
		
		
		System.out.println(function);
	}
}
