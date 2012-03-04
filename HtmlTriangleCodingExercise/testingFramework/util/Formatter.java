package util;

import java.util.ArrayList;
import java.util.Iterator;

import util.exceptions.TextNotFoundException;

//TODO - LF - Create a Formatter class to format strings
public class Formatter {

//TODO LF - implementing formatCoordinates method
/**
 * Formats passed coordinates to remove unwanted white spaces and insignificant characters such as '(' and')'
 *@param inputCoords and character array for starting and ending characters to be omitted
 *@return ArrayList of coordinates 
 */
	public static ArrayList formatCoordinates (String inputCoords, char toBeOmittedStart, char toBeOmittedEnd) throws TextNotFoundException{
		ArrayList arrayTokens = new ArrayList<String>();
		ArrayList arrayCoords = new ArrayList<String>();
		String firstPointCoords  ;
		String secondPointCoords ;
		String thirdPointCoords ;
		
		
		Iterator iter = StringManipulator.stringTokenizer(inputCoords);
		while (iter.hasNext()){
			arrayTokens.add((String)iter.next());
		}
		
		try {
 		   firstPointCoords = StringManipulator.stringParser((String)arrayTokens.get(0),toBeOmittedStart,toBeOmittedEnd );
 		   arrayCoords.add(firstPointCoords);
 		   secondPointCoords = StringManipulator.stringParser((String)arrayTokens.get(1),toBeOmittedStart,toBeOmittedEnd );
 		  arrayCoords.add(secondPointCoords);
 		   thirdPointCoords = StringManipulator.stringParser((String)arrayTokens.get(2),toBeOmittedStart,toBeOmittedEnd );
 		  arrayCoords.add(thirdPointCoords);
 		 
 		  System.out.println("triangle coordinate text is: "+firstPointCoords+","+secondPointCoords+","+thirdPointCoords);
 			return arrayCoords;
 	   	}
		
		catch (TextNotFoundException e){
 		  throw new TextNotFoundException(e.getMessage());	   
 	   }
	}
}
