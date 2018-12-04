package derivative;

import java.util.ArrayList;

public interface TermInterface 
{
	public abstract Term derive(Term term);
	
	public ArrayList<Term> multiplied = new ArrayList<Term>();
	
	public abstract void setCoefficient(double coefficient);
	
	public abstract void setPower(double power);
	
	public abstract double getCoefficient();
	
	public abstract double getPower();

	public abstract String toString();
	
	public static Function function = new Function();
	
	public static Function parser(String parse)
	{
		int endOfPrevTerm = 0;
		for(int i = 0; i<parse.length()-1; i++)
		{
			String letter = parse.substring(i, i+1);
		
			if(letter.equals("x"))
			{
				try 
				{
					if(parse.substring(i+1,i+2).equals("^"))
					{
						String coefficient = "";
						String power = "";
						for(int j = endOfPrevTerm; j< i; j++)
						{
							coefficient += parse.substring(j,j+1);
						}
						for(int k = i+2; k<parse.length(); k++)
						{
							try 
							{
								Double.parseDouble(parse.substring(k,k+1));
							}
							catch(NumberFormatException exception)
							{
								k = parse.length();
							}
							power+=parse.substring(k,k+1);
						}
						function.addTerm(new XTerm(Double.parseDouble(coefficient), Double.parseDouble(power)));
					}
				}
				catch (IndexOutOfBoundsException exception)
				{
					function.addTerm(new XTerm(Double.parseDouble(parse.substring(endOfPrevTerm,i)), 1));
				}
			}
		}
		return function;
	}
	
	
}
