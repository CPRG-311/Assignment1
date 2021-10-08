package exceptions;
/**
 * @author Ashley Drinkill
 * exception thrown if there was an issue loading the array of Shapes
 *
 */
public class ArrayLoadingError extends Exception {
	
	public ArrayLoadingError(String message)
	{
		super(message);
	}
}
