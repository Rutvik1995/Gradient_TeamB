package grading;

import java.util.List;

public interface GradingStrategy {

	/*Grade gradeObj = null;
	public static Grade calculate(List<Grade> grades)
	{
		return gradeObj;
	}*/
	
	
	public Grade calculate(String courseWeight, List<Grade> grades) throws SizeException;
		

}
