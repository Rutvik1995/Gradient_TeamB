package grading;
import java.lang.Exception;
/*
 * Implementation of SizeException
 */
public class SizeException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	public SizeException() {}
	public SizeException(String message) throws Exception
	{
		super(message);
		//throw new Exception(message);
	}
}
