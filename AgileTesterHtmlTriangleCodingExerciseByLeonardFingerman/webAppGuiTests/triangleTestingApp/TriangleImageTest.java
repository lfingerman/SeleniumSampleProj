package triangleTestingApp;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import util.exceptions.DataNotFoundException;
import webPageElements.TriangleImage;


public class TriangleImageTest extends BaseWebPageTest {
	
	
	public TriangleImageTest() throws Exception {
		super();
	}
	//TODO - LF - Exercise 3 Implementing TriangleImage Test
	@Test
	public void canDrawScaleneTriangleBaseWithExpectedWidth() throws Exception {
		String firstSideSize = "300";
		String secondSideSize = "200";
		String thirdSideSize = "400";
		assertTrue(trianglePage.canSpecifyTriangle(firstSideSize, secondSideSize, thirdSideSize));
		trianglePage.draw();
		//this.selenium.waitForPageToLoad("5000");
		trianglePage.triangleImage.coordinatesAre("22,190;-2,98;164,190");
		trianglePage.triangleImage.triangleWidthIs(142.00);
		trianglePage.triangleImage.isImagePresent(trianglePage.triangleImage.xPathImagePresent);		
	}

	@Test
	public void canDrawIsoscelesTriangleBaseWithExpectedWidth() throws Exception {
		String firstSideSize = "3";
		String secondSideSize = "2";
		String thirdSideSize = "2";
		assertTrue(trianglePage.canSpecifyTriangle(firstSideSize, secondSideSize, thirdSideSize));
		trianglePage.draw();
		trianglePage.triangleImage.coordinatesAre("10,190;105,107;200,190");
		trianglePage.triangleImage.triangleWidthIs(190.00);
		trianglePage.triangleImage.isImagePresent(trianglePage.triangleImage.xPathImagePresent);
		
		
	}

	@Test
	public void canDrawEquilateralTriangleBaseWithExpectedWidth() throws Exception {
		String firstSideSize = "3";
		String secondSideSize = "3";
		String thirdSideSize = "3";
		assertTrue(trianglePage.canSpecifyTriangle(firstSideSize, secondSideSize, thirdSideSize));
		trianglePage.draw();
		trianglePage.triangleImage.coordinatesAre("10,190;105,25;200,190");
		trianglePage.triangleImage.triangleWidthIs(190.00);
		trianglePage.triangleImage.isImagePresent(trianglePage.triangleImage.xPathImagePresent);
	}

	@Test
	public void canDrawRightTriangleBaseWithExpectedWidth() throws Exception {
		String firstSideSize = "3";
		String secondSideSize = "4";
		String thirdSideSize = "5";
		assertTrue(trianglePage.canSpecifyTriangle(firstSideSize, secondSideSize, thirdSideSize));
		trianglePage.draw();
		trianglePage.triangleImage.coordinatesAre("48,190;48,38;162,190");
		trianglePage.triangleImage.triangleWidthIs(114.00);
		trianglePage.triangleImage.isImagePresent(trianglePage.triangleImage.xPathImagePresent);	
		
	}
	
	
	
	//etc
	
}
