package grading;
import java.util.List;

/*
 * Interface for GradingStrategy
 */

//grading Strategy

public interface GradingStrategy {	
	
	public Grade calculate(String courseWeight, List<Grade> grades) throws SizeException;
		
}
