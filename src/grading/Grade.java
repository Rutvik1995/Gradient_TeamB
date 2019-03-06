package grading;
import java.text.DecimalFormat;
//import java.util.HashMap;

public class Grade 
{

	//HashMap<String, Double> Grade = new HashMap<>();
	private String key; 
	private Double value; 
	

    public Grade(String key) {
		if(key.equals("")) {
			 throw new IllegalArgumentException("key cannot be null.");
		}
		else
		{
			this.key = key;
			this.value = 0.0;
		}
		
	}
    
    public Grade(String key, Double value)
	{
    	if(key.equals("")) {
			 throw new IllegalArgumentException("key cannot be null.");
		}
		else
		{
			this.key = key;
			if(value == null)
	    	{
				this.value = 0.0;
	    	}
			else
			{
				this.value = value;
			}
		}
	}
	
    
	public Grade(String key, double value)
	{
		if(key.equals("")) {
			 throw new IllegalArgumentException("key cannot be null.");
		}
		else
		{
			this.key = key;
			this.value = value;
		}
	}


	public String getKey() {
        return key;
    }

    public double getValue() {
        return value;
    }
	
	@SuppressWarnings("unused")
	public int compareTo(Grade Other)
	{
		Double val = new Double(this.value);
		Double OtherVal = new Double(Other.value);
		if((val == null) && OtherVal != null )
			return -1;
		else if(val == null && OtherVal == null)
			return 0;
		else if(val != null && OtherVal == null)
			return 1;
		else 
			return val.compareTo(Other.value);
		//val != null && OtherVal != null
	}

		
	}


