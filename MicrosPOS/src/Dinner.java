
public class Dinner extends Menu
{
	private double price;
	
	public Dinner(String name, double price)
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
		String dinnerInfo = getName().toString() + "\t\t$" + price;
		return dinnerInfo;
	}
}
