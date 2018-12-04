package derivative;

public class XTerm extends Term
{
	public XTerm(double coefficient, double power)
	{
		super(coefficient, power);
	}

	@Override
	public Term derive(Term term) 
	{
		return null;
	}
	
	public String toString()
	{
		return coefficient + "x^" + power;
	}

}
