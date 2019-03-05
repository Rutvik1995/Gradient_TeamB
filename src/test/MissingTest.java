package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import grading.Missing;

class MissingTest {


	 @Test
	 public void doubleValue()
	 {
	     //double       balance;        
	     //GiftCard     card;
	     //int          issuingStore;
	     double value=0.0;
	     String key ="str";
	     double number=0.0; 
	     //double missing;
	     String missing="number";
	     double missingValue=9.0;
	     Missing card = new Missing();
	     
	     //assertEquals("grade",missing,card.doubleValue(null, missingValue),0.0001);      
	     assertEquals("grade",number,card.doubleValue(number, missingValue),0.0001); 
	 }
	 
	 
	 @Test
	 public void doubleValue2()
	 {
	     //double       balance;        
	     //GiftCard     card;
	     //int          issuingStore;
	     double value=0.0;
	     String key ="str";
	     double number=0.0; 
	     //double missing;
	     String missing="number";
	     double missingValue=9.0;
	     Missing card = new Missing();
	     
	     assertEquals("grade",missing,card.doubleValue(null, missingValue));      
	     //assertEquals("grade",number,card.doubleValue(number, missingValue),0.0001); 
	 }
	 
	 @Test
	 public void doubleValue3()
	 {
	     //double       balance;        
	     //GiftCard     card;
	     //int          issuingStore;
	     double missing=0.0;
	     String key ="str";
	     double number=0.0; 
	     //double missing;
	    // String missing="number";
	     double missingValue=9.0;
	     Missing card = new Missing();
	     
	     assertEquals("grade",missing,card.doubleValue(null),0.0001);      
	     //assertEquals("grade",number,card.doubleValue(number, missingValue),0.0001); 
	 }
	 
	 

}
