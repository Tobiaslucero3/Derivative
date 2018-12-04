package derivative;

import java.util.ArrayList;

public class Function extends Term
{
	private ArrayList<Term> terms = new ArrayList<Term>();
	
	public Function() {}

	@Override
	public Term derive(Term term) 
	{
		return null;
	}
	
	public void addTerm(Term term)
	{
		terms.add(term);
	}
	
	public String toString()
	{
		String ret = "";
		for(Term term: terms)
		{
			ret+=term.toString()+"+";
		}
		return ret;
	}
	
	
	
	

}
