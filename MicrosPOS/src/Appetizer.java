
public class Appetizer extends Menu
{
	private double price;
	
	public Appetizer(String name, double price)
	{
		super(name);
		this.price = price;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	@Override
	public String toString()
	{
		String appInfo = getName().toString() + "\t\t$" + price;
		return appInfo;
	}
	
	
}
