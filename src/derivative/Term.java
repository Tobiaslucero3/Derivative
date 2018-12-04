package derivative;

import java.util.ArrayList;

public abstract class Term implements TermInterface
{
	protected double coefficient;
	
	protected double power;
	
	public Term(double coeff, double pow)
	{
		coefficient = coeff;
		power = pow;
	}
	
	public Term() {}
	
	public void setPower(double pow)
	{
		power = pow;
	}
	
	public void setCoefficient(double coeff)
	{
		coefficient = coeff;
	}
	
	public double getPower() 
	{
		return power;
	}
	
	public double getCoefficient()
	{
		return coefficient;
	}
	
	public void addMultiplied(Term term)
	{
		multiplied.add(term);
	}
	
	public ArrayList<Term> getMultiplied()
	{
		return multiplied;
	}
}
