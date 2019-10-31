
public class Lunch extends Menu
{
	private double price;
	
	public Lunch(String name, double price)
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
		String lunchInfo = getName().toString() + "\t\t$" + price;
		return lunchInfo;
	}
}
