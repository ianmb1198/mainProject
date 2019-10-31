
public class Beverage extends Menu
{
	private double price;
	
	public Beverage(String name, double price)
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
		String bevInfo = getName().toString() + "\t\t$" + price;
		return bevInfo;
	}
}
