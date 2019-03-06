package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import grading.SizeException;

class SizeExceptionTest {

	@Test
	 public void Exception()  throws java.lang.Exception
	 {
		 String Message = "Hello";
		 
		 SizeException e = new SizeException(Message);
		 
	 }
	 
	 
	 @Test
	 public void Exception2()  throws java.lang.Exception
	 {
		 String Message = "Hello";
		 
		 SizeException e = new SizeException();
		 
	 }
}
