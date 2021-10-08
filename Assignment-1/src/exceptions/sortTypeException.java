package exceptions;

/**
 * @author Ethan Wright
 * exception thrown if there is an issue with the input for the compare type
 * 
 */
public class sortTypeException extends Exception{
	
	public sortTypeException(String message)
	{
		super(message);
	}

}
