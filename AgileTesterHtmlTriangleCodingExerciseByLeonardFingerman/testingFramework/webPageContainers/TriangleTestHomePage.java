package webPageContainers;

import static org.testng.Assert.assertTrue;
import util.StringManipulator;
import util.exceptions.TextNotFoundException;
import webPageElements.TextField;
import webPageElements.TextLabel;
import webPageElements.TriangleImage;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class TriangleTestHomePage extends BasePageContainer {
	public static final String TESTING_TRIANGLES_URL = "http://practice.agilistry.com/triangle/";
	
	//private static final String ASCII_FOR_CARRIAGE_RETURN = "13";
	//TODO-LF KeyCode 13 isn't accepted as valid key code on WinXP Professional SP2. Changing to platform-independent constant below
	private static final String ASCII_FOR_CARRIAGE_RETURN= Integer.toString(java.awt.event.KeyEvent.VK_ENTER);
	private TextField triangleSide2TextField;
	private TextField triangleSide1TextField;
	private TextField triangleSide3TextField;
	private TextLabel triangleTypeLabel;
	
	public TriangleImage triangleImage;
	public TestSessionHistory sessionHistory;
	
	public TriangleTestHomePage() throws Exception {
		goToPage(TESTING_TRIANGLES_URL);
		verifyTitleIsCorrect("Triangle Tester Exercise");
		triangleSide1TextField = new TextField("triangle_side1");
		triangleSide2TextField = new TextField("triangle_side2");
		triangleSide3TextField = new TextField("triangle_side3");
		triangleTypeLabel = new TextLabel("triangle_type");
		triangleImage = new TriangleImage();
		sessionHistory = new TestSessionHistory();
	}
	
	public boolean canSpecifyTriangle(String firstSideSize, String secondSideSize, String thirdSideSize) {
		assertTrue(triangleSide1TextField.canEnterText(firstSideSize));
		assertTrue(triangleSide2TextField.canEnterText(secondSideSize));
		assertTrue(triangleSide3TextField.canEnterText(thirdSideSize));
		return true;
	}
	
	public void draw() {
		selenium.keyPressNative(ASCII_FOR_CARRIAGE_RETURN);
	}
	
	public boolean triangleTypeLabelReads(String expected) {
		assertTrue(triangleTypeLabel.reads(expected));
		return true;
	}
	
	public boolean triangleImageCoordinatesAre(String expected) {
		assertTrue (triangleImage.coordinatesAre(expected));
		return false;
	}
	

	
}
