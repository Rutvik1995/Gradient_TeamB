package grading;
import java.util.List;

/*
 * Interface for GradingStrategy
 */

public interface GradingStrategy {	
//	Calculate the grade
	public Grade calculate(String courseWeight, List<Grade> grades) throws SizeException;
		
}
