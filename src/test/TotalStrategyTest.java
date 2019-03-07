package test;
import grading.Grade;
import grading.Missing;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import grading.Grade;
import grading.SizeException;
import grading.TotalStrategy;


class TotalStrategyTest {
	double total = 0.0;
	Grade grade;
	@Test
	public void testSizeException() 
	{
		ArrayList<Grade> ge4 = null;
		TotalStrategy t= new TotalStrategy();
		assertThrows( SizeException.class, () -> {  t.calculate( "HW" , ge4); } );
	}
   
	@Test
	public void testTotal() throws SizeException {
		ArrayList<Grade> ge4=new ArrayList<Grade>();
			ge4.add(grade);
		}
	@Test
	public void calculatetotal() throws SizeException {
		ArrayList<Grade> ge4;
		ge4 = new ArrayList<Grade>();
		Grade grades;
		double[] arr = new double[] {1.0,3.0,4.0,5.0,8.0,9.0};
		for (int i=0; i<6; i++) 
		{
			grades = new Grade("PA"+i, arr[i]);
			ge4.add(grades);
		}
		TotalStrategy t= new TotalStrategy();
		assertEquals("PA:25.0", t.calculate("PA", ge4).toString());
		}
	
}

