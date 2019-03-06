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
	
	
}

