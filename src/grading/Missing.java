package grading;

public class Missing {

	public double missing;
	public Missing()
	{
		missing = 0.0;
	}
//	Check for the number
	public double doubleValue(Double number)
	{
//Check if number is null
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
		//Check if number is null
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
