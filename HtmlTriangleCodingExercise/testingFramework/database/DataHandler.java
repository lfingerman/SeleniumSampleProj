package database;
//TODO LF - layer of data abstraction to handles any data sets stored in a database
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.DataFormatException;




/**
 * DataHandler class will operate on a given DB data set
 * It will load a row of fetched data into a HashMap and then
 * load all rows into an ArrayList.
 * Subsequently an ArrayList can be used in the calling classes.
 *  
 * @author lefingerman
 *
 */
/*
public class DataHandler{
	
	private DBAdaptor db; 
	private ArrayList listofDataRows = new ArrayList();
	private String query; 
	
	/**
	 * Constructor for DataHandler Class.
	 * It will create an AccessAdaptor or OracleAdaptor object with passed
	 * dbPath parameter.  It will also set the query data memeber of the class
	 * with a passed parameter query.
	 * 
	 * @param dbPath - use data.Constants to set and pass it as a parameter
	 * @param query
	 */
/*
	public DataHandler (String AccessDBpath, String AccessDBquery){
		
		db = new AccessAdaptor(AccessDBpath);
		query = AccessDBquery;
		
	}
	
	public DataHandler (int OracleDBName, String OracleDBquery){
		db = new OracleAdaptor(OracleDBName);
		query = OracleDBquery;
	}
	/**
	 * Will populate HashMap dataRowWithColumnNameAndValue with columnName/columnValue
	 * key/value pair from a data table. It will add HashMap
	 * data to listofDataRows ArrayList one row at a time.
	 * Use numRowsToAdd as argument to determine number of rows to add to
	 * listofDataRows.  If that's not required then use populateListWithData()
	 * method instead to add all rows of data to listofDataRows.
	 *  
	 * @param numRowsToAdd
	 * @return listofDataRows
	 */
	/*
private ArrayList populateListWithData (int numRowsToAdd){
	//implement
		
	}


	/**
	 * Adding to an array list one row of table data at a time 
	 * @param dataRowWithColumnNameAndValue
	 */
/*
	private void setListWithRowOfData( HashMap dataRowWithColumnNameAndValue ){
	
	}
	
	/**
	 * Will return all data fetched from the data table  
	 * @return ArrayList
	 */
/*
	public ArrayList getRowsOfData () throws DataNotFoundException {
			

			
	}

	/**
	 * Will obtain the value based on the row of fetched data and a column name 
	 * @param rowNumber - the number of row of data
	 * @param columnName - the name of column to obtain value for
	 * @return the value of passed columnName
	 * @throws DataNotFoundException
	 */
/*
	public String getValueForColumnName (int rowNumber, String columnName) throws DataNotFoundException {
	
	}

	
	/**
	 * Will return only specified number of rows fetched from the data table 
	 * @param numRowsToFetch
	 * @return ArrayList
	 * @throws DataNotFoundException
	 */
/*
	public ArrayList getRowsOfData (int numRowsToFetch) throws DataNotFoundException {
		
	
	}
	
	public void closeDB(){
	
}
*/