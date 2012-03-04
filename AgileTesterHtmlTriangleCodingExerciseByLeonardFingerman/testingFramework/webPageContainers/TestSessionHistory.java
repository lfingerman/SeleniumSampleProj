package webPageContainers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import static org.testng.Assert.assertTrue;

import util.exceptions.DataNotFoundException;
import webPageElements.BasePageElement;

public class TestSessionHistory extends BasePageElement {
	//TODO - LF Exercise 4 implementing TestSessionHistory class
	public final static String xpathSide1 ="//*[@id=\"triangles_list\"]/div[1]/div[1]";
	public final static String xpathSide2 ="//*[@id=\"triangles_list\"]/div[1]/div[2]";
	public final static String xpathSide3 ="//*[@id=\"triangles_list\"]/div[1]/div[3]";
	public final static String xpathCategory ="//*[@id=\"triangles_list\"]/div[1]/div[4]";
	public final static String xpathCoordinates ="//*[@id=\"triangles_list\"]/div[1]/div[5]";
	

		
	private List<TriangleResult> triangleDrawnHistory;

	public TestSessionHistory() throws Exception {
		super();
		triangleDrawnHistory = new ArrayList<TriangleResult>();
	}
	
	private void addTestResultsToDrawnHistoryList (TriangleResult tResult){
		triangleDrawnHistory.add(tResult);
	}
	
	public void addLastDataRowToSessionHistory (){
		
		TriangleResult testResults =
					new TriangleResult (selenium.getText(xpathSide1), selenium.getText(xpathSide2), selenium.getText(xpathSide3), 
										selenium.getText(xpathCategory), selenium.getText(xpathCoordinates));
		
		this.addTestResultsToDrawnHistoryList(testResults);
		
	}
	
	public void sessionHistoryLastRowReads (String expectedSide1,String expectedSide2,String expectedSide3, 
												String expectedCategory, String expectedCoords ){
		try {
			addLastDataRowToSessionHistory();
			TriangleResult tResultLastRow = triangleDrawnHistory.get(triangleDrawnHistory.size()-1);
			assertTrue(tResultLastRow.getSide1().equals(expectedSide1));
			assertTrue(tResultLastRow.getSide2().equals(expectedSide2));
			assertTrue(tResultLastRow.getSide3().equals(expectedSide3));
			assertTrue(tResultLastRow.getCategory().equals(expectedCategory));
			assertTrue(tResultLastRow.getCoordinates().equals(expectedCoords));
		}
					
		catch (Exception e){
			e.printStackTrace();
		}
	}

}
