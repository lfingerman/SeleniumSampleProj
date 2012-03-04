package webPageElements;

import static org.testng.Assert.assertTrue;

//TODO - LF  Exercise 3 importing all relevant packages parsing
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

import util.Formatter;
import util.StringManipulator;
import util.exceptions.DataNotFoundException;
import util.exceptions.TextNotFoundException;
import webPageContainers.TriangleTestHomePage;


//TODO - LF - Exercise 3 imported SeleniumException class to implement methods in TriangleImage class
import com.thoughtworks.selenium.SeleniumException;


public class TriangleImage extends BasePageElement {
	
	//TODO - LF - Exercise 3 define xpath local var for coordinate location
	public static final String xpathCoords="/html/body/div/div[2]/div[3]/div[2]/div/div/div[5]";
	public static final String xPathImagePresent = "//*[@id=\"canvas\"]/s:svg/s:path";
	private double triangleWidth = 0.00;
	
	
	public TriangleImage() throws Exception {
		
		super();
	}
	
/**
 * 
 * @param expectedCoords - to be passed with X,Y coordinates separated by comma. Set of coordinates to be separated by semi-column
 * 							Ex: 123,111;321,222;213,333
 * @return 	true - found 
 * 			false - not found
 */
	
	@SuppressWarnings("unchecked")
	public boolean coordinatesAre(String expectedCoords) {
		//implement me
		//TODO - LF -  Exercise 3 Implementing coordinatesAre method
			
		ArrayList<String> listCoords;
		boolean result = false;
		
		String firstPointCoords  ;
		String secondPointCoords ;
		String thirdPointCoords ;

		String actualCoords = super.selenium.getText("xpath="+xpathCoords).trim();
    
		try {
				listCoords = Formatter.formatCoordinates(actualCoords,'(' , ')');
				firstPointCoords = listCoords.get(0);
				secondPointCoords = listCoords.get(1);
				thirdPointCoords = listCoords.get(2);
				
				actualCoords = firstPointCoords+";"+secondPointCoords+";"+thirdPointCoords;
    			System.out.println("triangle coordinate text is: "+actualCoords);
    			
    			setTriangleWidth(calculateTriangleWidth(firstPointCoords, thirdPointCoords));
    			assertTrue(expectedCoords.equals(actualCoords));
    			result=true;
    			return result;
    	   }
		
		catch (Exception e){
    		   e.printStackTrace();
    		   result=false;
    		   return result;
    	   }
 	}
	
	//TODO - LF - Implementing Exercise 3 isImagePresent method
	 public boolean isImagePresent(String xPath){
		    boolean result = false;
		    try {
		      assertTrue(super.selenium.isElementPresent("xpath="+xPath));
		      result = true;
		    } catch (SeleniumException e) {
		      if (e.getMessage().contains("ERROR: Element " + xPath + " not found")) {
		        result = false;
		      } else {
		        throw(e);
		      }
		    }
		    return result;
		  }
	 
	 public void triangleWidthIs (double expectedWidth){
		
		 assertTrue(getTriangleWidth()==expectedWidth);
		
	 }
	
	public double calculateTriangleWidth (String firstPointCoord, String thirdPointCoord) throws DataNotFoundException {
		double triangleWidth =0.00;
		try {
			String firstPointXcoord = StringManipulator.stringParser(firstPointCoord, ',');
			String thirdPointXcoord = StringManipulator.stringParser(thirdPointCoord, ',');
			triangleWidth = Double.parseDouble(thirdPointXcoord) - Double.parseDouble(firstPointXcoord);
			setTriangleWidth(triangleWidth);
			return triangleWidth;
			
		}
		catch (TextNotFoundException e){
			e.printStackTrace();
			throw new DataNotFoundException(); 
		}
	}
	
	public void setTriangleWidth(double triangleWidth){
		this.triangleWidth = triangleWidth;
	}
	
	public double getTriangleWidth (){
		return triangleWidth;
	}

}
