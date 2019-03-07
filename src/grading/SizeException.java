package grading;
import java.lang.Exception;

public class SizeException extends Exception
{
	private static final long serialVersionUID = 1L;
//	size exceptino
	public SizeException() {}
	public SizeException(String message) throws Exception
	{
		super(message);
		//throw new Exception(message);
	}
}
