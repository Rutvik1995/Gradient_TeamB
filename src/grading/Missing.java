package grading;

public class Missing {

	public double missing;
	public Missing()
	{
		missing = 0.0;
	}
	
	public double doubleValue(Double number)
	{
		if(number != null)
		{
			return number;
		}
		else
		{
			return missing;
		}
	}
	
	public double doubleValue(Double number, double missingValue)
	{
		if(number != null)
		{
			return number;
		}
		else
		{
			return missingValue;
		}
	}
	
}

//Testing to push on git
//Neha's commit'