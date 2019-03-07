package grading;
import java.util.List;
import java.lang.Exception;

public class TotalStrategy implements GradingStrategy  {   
	//implements GradingStrategy

	public TotalStrategy() {}

		
		public Grade calculate(String key, List<Grade> grades) throws SizeException
		{
			Grade gradeObject = null;
			Missing missing = new Missing();
				try {
					if(grades == null || grades.isEmpty())
					{
						throw new SizeException("Grade cannot be NULL");
					}
					else
					{
						double Total = 0.0;
						double minDoubleList = min(grades);
						for(Grade item : grades)
						{
							
							if(missing.doubleValue(item.getValue()) < 0.0)  //item.value < 0
							{
								Total += 0.0;
							}
							else
							{
									Total += item.getValue();
							}
							//gradeObject = new Grade(item.getKey(), Total);
						}
						if(key == "PAs")
						{
							Total -= minDoubleList;
						}
				
						gradeObject = new Grade(key, Total);
			
					}
					
					return gradeObject;  // Grade Initialization
				}
				catch ( Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					//throw e;
				}

				return gradeObject;

	
	

	}
		
		public static double min(List<Grade> list) {
		     // Validates input
		     if (list == null) {
		         throw new IllegalArgumentException("The Array must not be null");
		     } else if (list.isEmpty()) {
		         throw new IllegalArgumentException("Array cannot be empty.");
		     }
		 
		     // Finds and returns min
		     double min = list.get(0).getValue();
		     for (int i = 1; i < list.size(); i++) {
		         if (Double.isNaN(list.get(i).getValue())) {
		             return Double.NaN;
		         }
		         if (list.get(i).getValue() < min) {
		             min = list.get(i).getValue();
		         }
		     }
		 
		     return min;
		 }
		
		
 }