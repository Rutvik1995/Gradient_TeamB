package grading;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;



class DropFilterTest 
{

	@Test
	 public void applyTest() throws SizeException
	 {
		 
		 Filter                   paFilter;        
			Grade                    courseGrade, hwGrade, paGrade;
			GradingStrategy          courseStrategy, hwStrategy, paStrategy;
			List<Grade>              grades, hws, pas;
			Map<String, Double>      courseWeights;
			String[] args= {"10.0", "10.0", "5.0", "15.0", "5.0", "20.0", "20.0", "0.0", "0.0", "10.0", "15.0", "60.0", "45.0"};
			

			// Create the filter and strategy for PAs
			paFilter   = new DropFilter(true, false);
			paStrategy = new TotalStrategy(); 

			// Create the strategy for HWs
			hwStrategy = new TotalStrategy();

			// Create the weights and strategy for the course grade
			courseWeights = new HashMap<String, Double>();
			courseWeights.put("PAs",     0.4);
			courseWeights.put("HWs",     0.1);
			courseWeights.put("Midterm", 0.2);
			courseWeights.put("Final",   0.3);
			courseStrategy = new WeightedTotalStrategy(courseWeights);

			try
			{
				// Put the PA grades in a List
				pas = new ArrayList<Grade>();
				for (int i=0; i<6; i++) 
				{
					pas.add(parseGrade("PA"+(i+1), args[i]));
				}

				// Calculate the PA grade (after filtering)
				paGrade = paStrategy.calculate("PAs", Filter.apply(pas));

				// Put the HW grades in a List
				hws = new ArrayList<Grade>();
				for (int i=0; i<5; i++)
				{
					hws.add(parseGrade("HW"+(i+1), args[i+6]));
				}

				// Calculate the HW grade
				hwGrade = hwStrategy.calculate("HWs", hws);

				// Put all of the grades in a List
				grades = new ArrayList<Grade>();
				grades.add(paGrade);
				grades.add(hwGrade);
				grades.add(parseGrade("Midterm", args[11]));
				grades.add(parseGrade("Final",   args[12]));
		
		 
		 
		 
	     DropFilter  e = new DropFilter();
		 
	     
	     assertEquals("grade",grades,e.apply(grades));      
	     //assertEquals("grade",number,card.doubleValue(number, 
		
	 }catch (SizeException se)
			{
			System.out.println("You entered too few valid grades.");
		}
		catch (IllegalArgumentException iae)
		{
			// Should never get here since all keys should be valid
		}
	 
	 
	}

	 
	 @Test
	 public void applyTest2() throws SizeException
	 {
		 
		 Filter                   paFilter;        
			Grade                    courseGrade, hwGrade, paGrade;
			GradingStrategy          courseStrategy, hwStrategy, paStrategy;
			List<Grade>              grades, hws, pas;
			Map<String, Double>      courseWeights;
			String[] args= {"20.0", "20.0", "20.0", "20.0", "20.0", "20.0", "20.0", "20.0", "20.0", "10.0", "15.0", "60.0", "45.0"};
			

			// Create the filter and strategy for PAs
			paFilter   = new DropFilter(true, false);
			paStrategy = new TotalStrategy(); 

			// Create the strategy for HWs
			hwStrategy = new TotalStrategy();

			// Create the weights and strategy for the course grade
			courseWeights = new HashMap<String, Double>();
			courseWeights.put("PAs",     0.4);
			courseWeights.put("HWs",     0.1);
			courseWeights.put("Midterm", 0.2);
			courseWeights.put("Final",   0.3);
			courseStrategy = new WeightedTotalStrategy(courseWeights);

			try
			{
				// Put the PA grades in a List
				pas = new ArrayList<Grade>();
				for (int i=0; i<6; i++) 
				{
					pas.add(parseGrade("PA"+(i+1), args[i]));
				}

				// Calculate the PA grade (after filtering)
				paGrade = paStrategy.calculate("PAs", Filter.apply(pas));

				// Put the HW grades in a List
				hws = new ArrayList<Grade>();
				for (int i=0; i<5; i++)
				{
					hws.add(parseGrade("HW"+(i+1), args[i+6]));
				}

				// Calculate the HW grade
				hwGrade = hwStrategy.calculate("HWs", hws);

				// Put all of the grades in a List
				grades = new ArrayList<Grade>();
				grades.add(paGrade);
				grades.add(hwGrade);
				grades.add(parseGrade("Midterm", args[11]));
				grades.add(parseGrade("Final",   args[12]));
		
		 
		 
		 
	     DropFilter  e = new DropFilter();
		 
	     
	     assertEquals("grade",grades,e.apply(grades));      
	     //assertEquals("grade",number,card.doubleValue(number, 
		
	 }catch (SizeException se)
			{
			System.out.println("You entered too few valid grades.");
		}
		catch (IllegalArgumentException iae)
		{
			// Should never get here since all keys should be valid
		}
	 
	 
	}
	 static Grade parseGrade(String key, String value) throws IllegalArgumentException
		{
			Grade  result;
			
			try
			{
				Double v;
				if (value == null) v = null;
				else v = new Double(Double.parseDouble(value));
				
				result = new Grade(key, v);
			}
			catch (NumberFormatException nfe)
			{
				result = new Grade(key, null);
			}
			
			return result;
		}
	 
	 
}
