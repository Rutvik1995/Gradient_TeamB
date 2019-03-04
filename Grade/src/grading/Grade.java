package grading;
import java.text.DecimalFormat;
//import java.util.HashMap;
//import java.util.List;

public class Grade {

	//HashMap<String, Double> Grade = new HashMap<>();
	public String key; //final
	public Double value; //final
	

    public Grade(String key) {
		if(key == null) {
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
    	if(key == null) {
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
		if(key == null) {
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
		else //if(val != null && OtherVal != null)
			return val.compareTo(Other.value);
		//else
			//return 0;
	}

	@SuppressWarnings("unused")
	public String toString()
	{
		Double val = new Double(this.value);
		DecimalFormat dval = new DecimalFormat("#####.#");
		dval.format(val);
		if(dval != null)
		{
			// field of width 5 add 1 decimal to the right - modify value 
			String formatString = this.key + ": " + dval;
			//formatString.substring(0, 4);
			return formatString;
		}
		else
		{
			//test to check if max this.key length to set to fixed 2 if not trim and then add static 3 length
			StringBuilder sb = new StringBuilder();
			sb.setLength(5);
			sb.append(this.key + ": " + " NA");
			//sb.append(" NA");
			return sb.toString();
			/*sb.setLength(5);
			String formatString = this.key + ": " + sb.toString();
			return formatString;*/
		}
		
	}

	public void Grade(Object object) {
		// TODO Auto-generated method stub
		
	}

}
