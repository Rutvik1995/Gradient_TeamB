package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import grading.Grade;
import grading.SizeException;
import grading.TotalStrategy;



class TotalStrategyTest {

	@Test
	public void testSizeException() 
	{
		ArrayList<Grade> ge4 = new ArrayList<Grade>();
		TotalStrategy t= new TotalStrategy();
		assertThrows( SizeException.class, () -> {  t.calculate( "HW" , ge4); } );
	}

}
