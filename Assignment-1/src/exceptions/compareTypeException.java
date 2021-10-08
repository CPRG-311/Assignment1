package exceptions;
/**
 * @author Ethan Wright
 * exception thrown if there is an issue with the input for the compare type
 *
 */
public class compareTypeException extends Exception{
	
	public compareTypeException(String message)
	{
		super(message);
	}

}
