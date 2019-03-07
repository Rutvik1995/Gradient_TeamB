package test;

import grading.Grade;
import grading.Missing;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import grading.SizeException;
import grading.TotalStrategy;
import grading.WeightedTotalStrategy;

import java.util.Map;
class WeightTotalStrategyTest {


	@Test
	public void testOutput() throws SizeException {
		WeightedTotalStrategy weightTotalGrades = new WeightedTotalStrategy();
		Map<String, Double> courseWeights = null;
		
		ArrayList<Grade> allgrades = new ArrayList<Grade>();
		allgrades.add(new Grade("PAs", 85.0));
		allgrades.add(new Grade("HWs", 48.0));
		allgrades.add(new Grade("Midterm", 75.0));
		allgrades.add(new Grade("Final", 60.0));	
		assertEquals("grades",weightTotalGrades.calculate("Course Grade", allgrades).toString());
	}

	
}

