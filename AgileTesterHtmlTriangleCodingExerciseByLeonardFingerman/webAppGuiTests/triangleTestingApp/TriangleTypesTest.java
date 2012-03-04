package triangleTestingApp;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

//For instructions, please see the README file

public class TriangleTypesTest extends BaseWebPageTest {
	public TriangleTypesTest() throws Exception {
		super();
	}

	@Test
	public void canCreateRightTriangle() throws Exception {
		String firstSideSize = "3";
		String secondSideSize = "4";
		String thirdSideSize = "5";
		assertTrue(trianglePage.canSpecifyTriangle(firstSideSize, secondSideSize, thirdSideSize));
		trianglePage.draw();
		
		assertTrue(trianglePage.triangleTypeLabelReads("Right"));
	}
	//TODO LF - Exercise 2 Happy Path - Testing for Scalene triangle  
	@Test
	public void canCreateScaleneTriangle() throws Exception {
		String firstSideSize = "300";
		String secondSideSize = "200";
		String thirdSideSize = "400";
		assertTrue(trianglePage.canSpecifyTriangle(firstSideSize, secondSideSize, thirdSideSize));
		trianglePage.draw();
		
		assertTrue(trianglePage.triangleTypeLabelReads("Scalene"));
	}
	//TODO LF - Exercise 2 Happy Path - Testing for Isosceles triangle  
	@Test
	public void canCreateIsoscelesTriangle() throws Exception {
		String firstSideSize = "3";
		String secondSideSize = "2";
		String thirdSideSize = "2";
		assertTrue(trianglePage.canSpecifyTriangle(firstSideSize, secondSideSize, thirdSideSize));
		trianglePage.draw();
		
		assertTrue(trianglePage.triangleTypeLabelReads("Isosceles"));
	}
	//TODO LF - Exercise 2 Happy Path - Testing for Equilateral triangle 
	@Test
	public void canCreateEquilateralTriangle() throws Exception {
		String firstSideSize = "3";
		String secondSideSize = "3";
		String thirdSideSize = "3";
		assertTrue(trianglePage.canSpecifyTriangle(firstSideSize, secondSideSize, thirdSideSize));
		trianglePage.draw();
		
		assertTrue(trianglePage.triangleTypeLabelReads("Equilateral"));
	}
	//TODO LF - Exercise 2 Happy Path - Testing for boundary values (empirically found to be 22-digits for an integer number) 
	@Test
	public void canAcceptBoundaryValuesMax() throws Exception {
		String firstSideSize = "1234567890123456789012";
		String secondSideSize = "1234567890123456789012";
		String thirdSideSize = "1234567890123456789012";
		assertTrue(trianglePage.canSpecifyTriangle(firstSideSize, secondSideSize, thirdSideSize));
		trianglePage.draw();
		
		assertTrue(trianglePage.triangleTypeLabelReads("Equilateral"));
	}
	//TODO LF - Exercise 2 Unhappy Path - Testing for decimal types of values 
	@Test
	public void canAcceptDecimalValues() throws Exception {
		String firstSideSize = "3.1";
		String secondSideSize = "4.77";
		String thirdSideSize = "5.9999";
		assertTrue(trianglePage.canSpecifyTriangle(firstSideSize, secondSideSize, thirdSideSize));
		trianglePage.draw();
		
		assertTrue(trianglePage.triangleTypeLabelReads("Right"));
	}
	//TODO LF - Exercise 2 Unhappy Path - Testing for boundary conditions Zero types of values 
	@Test
	public void canAcceptBoundaryValueZeros() throws Exception {
		String firstSideSize = "0";
		String secondSideSize = "0";
		String thirdSideSize = "0";
		assertTrue(trianglePage.canSpecifyTriangle(firstSideSize, secondSideSize, thirdSideSize));
		trianglePage.draw();
		
		assertTrue(trianglePage.triangleTypeLabelReads("Degenerate"));
	}
	
	//TODO LF - Exercise 2 Unhappy Path - Testing for invalid values 
	@Test
	public void canAcceptBoundaryValueNegative() throws Exception {
		String firstSideSize = "-1";
		String secondSideSize = "-2";
		String thirdSideSize = "-3";
		assertTrue(trianglePage.canSpecifyTriangle(firstSideSize, secondSideSize, thirdSideSize));
		trianglePage.draw();
		
		assertTrue(trianglePage.triangleTypeLabelReads("Invalid"));
	}
	
	//TODO LF - Exercise 2 Unhappy Path - Testing for alpha characters - it's supposed to pass but b/o Invalid isn't displayed it fails because it's an issue
	@Test
	public void canRejectAlphaValue() throws Exception {
		String firstSideSize = "a";
		String secondSideSize = "b";
		String thirdSideSize = "c";
		assertTrue(trianglePage.canSpecifyTriangle(firstSideSize, secondSideSize, thirdSideSize));
		trianglePage.draw();
		
		assertTrue(trianglePage.triangleTypeLabelReads("Invalid"));
	}

}
