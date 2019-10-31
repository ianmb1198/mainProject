
public class Menu 
{
	private String category;
	
	public Menu()
	{
		category = null;
	}
	
	public Menu(String category)
	{
		this.category = category;
	}
	
	public void setCategory(String category)
	{
		this.category = category;
	}
	
	public String getCategory()
	{
		return category;
	}
	
	public String toString()
	{
		return "Category: " + category;
	}
}
