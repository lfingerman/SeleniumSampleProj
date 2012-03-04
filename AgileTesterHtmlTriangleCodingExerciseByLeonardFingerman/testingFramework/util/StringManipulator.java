package util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

import util.exceptions.TextNotFoundException;
//TODO - LF Implemented StringManipulator that is meant to be accessed statically
public class StringManipulator {
/**
 * 
 * @param inputStr
 * @return Iterator with tokenized strings
 */
	 public static Iterator stringTokenizer (String inputStr){
			// String[] outStrArray ={"","","",""}; 
			 ArrayList outStrArrayList = new ArrayList<String>();
			 StringTokenizer Tok = new StringTokenizer(inputStr);
			 
			 //Loading Array List
			 while (Tok.hasMoreElements()){
				 outStrArrayList.add(Tok.nextElement().toString().trim());
			 }
			
			 Iterator iter = outStrArrayList.iterator(); 
			 
			 return iter;
		 }
		 
	 /**
	  * Will parse a passed string omitting starting and ending characters
	  * @param inputStr
	  * @param startAfterStr
	  * @param endBeforeStr
	  * @return parsed string
	  * @throws TextNotFoundException
	  */
		 public static String stringParser (String inputStr, char startAfterStr,char endBeforeStr) throws TextNotFoundException{
			
			int index;
			String outStr;
			
			if ( (inputStr.indexOf(startAfterStr)>=0)&& 
					(inputStr.indexOf(endBeforeStr))>=0){
					outStr = inputStr.substring((inputStr.indexOf(startAfterStr)+1),(inputStr.indexOf(endBeforeStr) )) ;
			}
			else{
				throw new TextNotFoundException("No such character "+startAfterStr+" or " +endBeforeStr+ "found in string "+inputStr);
				
			}
			
			
			 
			 return outStr;
		 }
		 
		 /**
		  * Overloaded stringParser method to accept only ending character.  That means it will omit the ending character in a passed string
		  * @param inputStr
		  * @param endBeforeStr
		  * @return
		  * @throws TextNotFoundException
		  */
		 public static String stringParser (String inputStr, char endBeforeStr) throws TextNotFoundException{
				
				int index;
				String outStr;
				
				if ( inputStr.indexOf(endBeforeStr)>=0)
						outStr = inputStr.substring(0,inputStr.indexOf(endBeforeStr) ) ;
				
				else{
					throw new TextNotFoundException("No such character " +endBeforeStr+ "found in string "+inputStr);
					
				}
				
				
				 
				 return outStr;
			 }
		
}
