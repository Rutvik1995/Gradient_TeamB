package grading;
//import grading.SizeException;
import java.util.List;
import java.lang.Exception;

public class TotalStrategy implements GradingStrategy  {   //implements GradingStrategy

	public TotalStrategy() {}
	//GradingStrategy grdStrategy = new GradingStrategy() {
		
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
						if(key == "PAs" && minCount(grades) > 0)
						{
							Total -= minDoubleList;
						}
					/*	if(Total > 100)
							Total -= maxDoubleList;*/
						gradeObject = new Grade(key, Total);
						//gradeObject.
					}
					
					return gradeObject;  // Grade Initialization
				}
				catch ( Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					//throw e;
				}
		//}
				return gradeObject;
		
	//};
	
	
	// test code below method to be sorted as to where to be added
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
		
		public static double minCount(List<Grade> list) {
			double min = min(list);
			int count = 0;
			for (int i = 1; i < list.size(); i++) {
				if(min == list.get(i).getValue())
				{
					count ++;
				}
		}
			return count;
		}

 }
	
	
