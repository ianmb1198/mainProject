
public class Menu 
{
	private String type;
	
	public Menu()
	{
		type = null;
	}
	
	public Menu(String type)
	{
		this.type = type;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public String getType()
	{
		return type;
	}
	
	public String toString()
	{
		return type;
	}
}
