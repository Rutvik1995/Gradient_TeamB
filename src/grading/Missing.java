package grading;

public class Missing {

	public double missing;
	public Missing()
	{
		missing = 0.0;
	}
	
	public double doubleValue(Double number)
	{
//		Compare the number to null
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
//		Compare the number to null
		if(number != null)
		{
			return number;
		}
		else
		{
//			return the missing value
			return missingValue;
		}
	}
	
}
