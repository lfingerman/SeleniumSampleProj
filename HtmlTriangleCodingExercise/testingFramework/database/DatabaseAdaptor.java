package database;
//TODO - LF DB Adaptor interface - specific database adaptors will implement this interface
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;




/**
 * @author lefingerman
 *
 */
/*
public interface DBAdaptor {
	public Connection connection=null;
    public Statement statement=null;
    
//	 The ResultSet for this instance, set during query method. 

	public ResultSet rs=null;
	
//	 The ResultSetMetaData for this instance, set during query method. 
	public ResultSetMetaData rsmd=null;
	
	
    // Close the Database connection
     // @throws SQLException
     //
    public void close() throws SQLException ;

  //
    // Return the database connection
     // @return
     //
    public Connection getConn() ;
    
    
    /**
	 * Runs a given SQL query .  To
	 * access the results use other methods on the same instance
	 * of this class.
	 * @param query The SQL statement to execute.
	 * @return True if query was successful.
	 */
/*
	public boolean query (String query) throws DataNotFoundException ;
	
	/**
	 * Iterates through the rows of this Database object.
	 * If you only want to look at one row you do not need to do this.
	 * Fails if Database object has not been queried.
	 * To parse through more than one row, do while (mydb.next()) {...}
	 * 
	 * @return True if another row found, false if not
	 */
/*
	public boolean nextRow() throws DataNotFoundException ;

	/**
	 * Returns an Iterator over the fields in the current row.
	 * Fails if Database object has not been queried.
	 * 
	 * @return An iterator over this row's columns
	 */
/*
	public Iterator getIteratorOverColumns() ;
	
	/**
	 * Returns a string from the column with the given name in the current
	 * row.  Automatically uses first row if needed.  Fails if
	 * Database object has not been queried.
	 * 
	 * @param column Name of the column you want to access
	 * @return Value in current row / given column
	 */
/*
	public String getValueForColumn(String columnName) throws DataNotFoundException ;

	/**
	 * Assumes that this Database instance only contains one field
	 * and returns that field.
	 * @return The returned field	
	 */
/*
	public String getFirstValue() throws DataNotFoundException ;
	
	/**
	 * Returns an ArrayList<String> of the values of each column in
	 * the current row.  Is private to encourage use of an iterator.
	 * 
	 * @return ArrayList of values of each column in
	 * current row
	 */
/*
	public List getRowAsList() throws DataNotFoundException ;
	
	public List getColumnNames () throws DataNotFoundException;
	
	/**
	 * Returns the number of columns in the current result set.  This method
	 * is private to encourage safer ways of iterating.
	 * 
	 * @return Number of columns in current result set
	 */
/*
	public int getColumnCount() throws DataNotFoundException ;
}
*/