package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import grading.Grade;
/*
   Test cases for Grade.java

 */
class GradeTest
{
	@Test
	public void testIllegalException() 
	{
		assertThrows( IllegalArgumentException.class, () -> { Grade grade =new Grade("",9.0); } );
	}
	
	
	@Test
	public void comp()
	{
		Grade grade1 = new Grade("Hw",7.8);
		Grade grade2 = new Grade("HW",null);
		assertEquals(-1,grade2.compareTo(grade1));
	}
	@Test
	public void comp2() 
	{
		Grade grade3 = new Grade("HW",null);
		Grade grade4 = new Grade("hw",null);
		assertEquals(0,grade3.compareTo(grade4));	
	}
	@Test
	public void comp3() 
	{
		Grade grade5 = new Grade("hw",null);
		Grade grade6 = new Grade("H.W",9.0);
		assertEquals(-1,grade5.compareTo(grade6));
	}
	
	@Test
	public void getKey()
    {
        
        double value=56.98;
        String key ="str";
        Grade card = new Grade(key);        
        assertEquals("grade",key, card.getKey());      
    }
	
	@Test
	public void getValue()
    {
                
        double value=56.98;
        String key ="str";
        Grade card = new Grade(key,value);
        assertEquals("grade",value, card.getValue(),0.0001);      
    }

}
	


