package triangleTestingApp;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import webPageContainers.TestSessionHistory;

public class TriangleHistoryTest extends BaseWebPageTest {
	private TestSessionHistory testHistory = new TestSessionHistory();
	
	public TriangleHistoryTest() throws Exception {
		super();
	}
	
	//TODO - LF Exercise 4 Implementing TriangleHistoryTest
	@Test
	public void canDisplayTestResultsInHistoryTable() throws Exception {
		String firstSideSize = "3";
		String secondSideSize = "2";
		String thirdSideSize = "2";
		String category = "Isosceles";
		String coordinates = "(10,190) (105,107) (200,190)";
		assertTrue(trianglePage.canSpecifyTriangle(firstSideSize, secondSideSize, thirdSideSize));
		trianglePage.draw();
		testHistory.sessionHistoryLastRowReads(firstSideSize, secondSideSize, thirdSideSize, category,coordinates);
		
	}

}
