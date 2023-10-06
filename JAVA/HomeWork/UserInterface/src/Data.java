
public class Data {
	private int key;
	private String value;
	
	public Data(int key, String value)
	{
		this.key = key;
		this.value = value;
	}

	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		if (key >= 0) 
		{
		this.key = key;
		}
	}
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
	
}
