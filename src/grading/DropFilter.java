package grading;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DropFilter implements Filter {
	
    private static boolean ShouldDropLowest;
    private static boolean ShouldDropHighest;
    
    public DropFilter () 
    {
    	
    }
    
	public DropFilter (boolean shouldDropLowest, boolean shouldDropHighest) {
		ShouldDropLowest = shouldDropLowest;
		ShouldDropHighest = shouldDropHighest;
	}

	
	public List<Grade> apply(List<Grade> grades) throws SizeException {
		//try {
			if(grades == null || grades.isEmpty())
			{
				try {
					throw new SizeException("Grade cannot be NULL");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else
			{
				if(ShouldDropLowest== true)
				{
					int minIndex;
					double minValue;
					List<Double> newList = new ArrayList<Double>();
					for(int i =0; i< grades.size(); i++)
					{
						newList.add(grades.get(i).getValue());
					}
					//newList = grades;
					
					minIndex = newList.indexOf(Collections.min(newList));
					minValue = newList.get(minIndex);
					grades.remove(minValue);
					
				}
				if(ShouldDropHighest== true)
				{
					int maxIndex;
					double maxValue;
					List<Double> newList = new ArrayList<Double>();
					for(int i =0; i< grades.size(); i++)
					{
						newList.add(grades.get(i).getValue());
					}
					//newList = grades;
					
					maxIndex = newList.indexOf(Collections.min(newList));
					maxValue = newList.get(maxIndex);
					grades.remove(maxValue);
					
				}	
				return grades;
					
			}			

			return grades;		
		
	}

}




