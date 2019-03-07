package grading;
import java.util.*;

public class WeightedTotalStrategy implements GradingStrategy {

	//Map<String, Double> weights;  //= new Map<String, Double>()
	private Map<String, Double> weights;
	private static final Double ZERO = new Double(0.0);
	public WeightedTotalStrategy() 
	{
		this(null, true);
	}
	
	public WeightedTotalStrategy(Map<String, Double> Totalweights, boolean ShouldIgnoreMissing)
	{
		weights = Totalweights;
		//shouldIgnoreMissing = ShouldIgnoreMissing;
	}
	
	public WeightedTotalStrategy(Map<String, Double> courseWeights) {
		super();
		weights = courseWeights;
	}

	public Grade calculate(String key, List<Grade> grades) throws SizeException
	{
		// no null assumption
		double                numerator, w;    // denominator     
	    Double                grade, weight;
	    
		/*try {*/
			if(grades == null || grades.isEmpty()) //grades.size() == 0) try
			{ 
				return new Grade(key, ZERO);
				//throw new SizeException("Grade cannot be NULL");
			}
			numerator   = 0.0;

				for(Grade item : grades)
				{
					//Grade gradeObj = new Grade(item.key);
					grade = item.getValue();
					
					if(weights == null)
					{
						//gradeObj.value = 1.0;
						//gradeReturnList.add(gradeObj);
						//return gradeObj;
						w = 1.0;
					}
					else
					{
						weight = weights.get(item.getKey());
				        w = weight.doubleValue();      
					}
					
					if (grade == null)
						numerator   += 0.0;
					else
				     {
				        // Handle an existing Grade
				        numerator   += w * grade;
				     }
				}

			
				return new Grade(key, new Double(numerator));
		}
	
}
