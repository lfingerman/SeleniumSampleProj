package util.exceptions;
//TODO - LF - Created new Exception type for data not found failed conditions 
/**
 * Thrown when, during the course of executing a test script, something tries
 * to access data that is unavailable.  There could be a variety of reasons for this:
 * a reason should be given when the exception is thrown.
 **/
public class DataNotFoundException extends Exception{
	  /**
     * @see Exception
     */
    public DataNotFoundException() {
    	super();
    }

    /**
     * @see Exception
     * @param message The message thrown with the exception.
     */
    public DataNotFoundException(String message) {
        super(message);
    }
}
