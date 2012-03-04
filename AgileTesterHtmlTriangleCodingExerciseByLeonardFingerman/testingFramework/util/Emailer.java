package util;
//import javax.mail.*;
//import javax.mail.internet.*;
import java.io.*;
import java.util.List;
//TODO - LF - this class will allow to email test results or read email messages if required
public class Emailer {
	  /**
     * Method to send an email using no default parameters: all necessary data
     * is passed as an argument.
     * @param subject the email's subject
     * @param content the email's body
     * @param from the email address the email is being sent from
     * @param to the email address the email is being sent to
     */
	public static void send(String subject,
	        				String content,
							String from,
							String to) {
	//implement	
	}
	
	/**
	 * Return a list of the messages in the default POP3 inbox.
	 * @return A List of String[]s where array[0] is the email subject and
	 * array[1] is the email body.
	 */
	public static List read(){
		return null; //added as an example
		//implement
	}
	
	
}
