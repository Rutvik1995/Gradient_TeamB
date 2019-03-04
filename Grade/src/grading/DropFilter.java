package grading;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DropFilter implements Filter {
	
    private static boolean ShouldDropLowest;
    private static boolean ShouldDropHighest;
    
    public DropFilter () {}
    
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
				if(ShouldDropLowest)
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
				if(ShouldDropHighest)
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


//grades.get()
//new Grade(grades.remove(Collections.min()) ;
//Grade newGrade = null;
//String Key = "";
//Double min = (double) 0;
/*for(Grade item: grades)
{
	if (min == 0) {
		min = item.getValue();
    }

    if (min > item.getValue()) {
    	min = item.getValue();
    	Key = item.getKey();
    	
    	
    	
    }

}
if(Key != "")
{
	grades.remove(Key);
	return grades;
}*/

//Double min = Collections.min((Collection<? extends T>) grades);
//Object obj = Collections.min(g);
// System.out.println("Minimum Element of HashSet is : " + obj);
// public static <T> T min(Collection<? extends grades> coll, Comparator<? super T> comp)
//}
//else if(ShouldDropHighest)
//	{
//Drop highest
//When dropping the highest and lowest, two elements must always be dropped, even if the highest and lowest have the same value.
//When determining the highest and/or lowest values it must account for missing (i.e., null) values as in the compareTo() method of the Grade class 
//}

//}
//catch()


