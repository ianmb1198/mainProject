
public class Beverage extends Menu
{
	private double price;
	private String item;
	
	public Beverage(String type, String item, double price)
	{
		super(type);
		this.item = item;
		this.price = price;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	public void setItem(String item)
	{
		this.item = item;
	}
	
	public double getPrice()
	{
		return price;
	}
	public String getItem()
	{
		return item;
	}
	
	@Override
	public String toString()
	{
		String bevInfo = item + "\t$" + price;
		return bevInfo;
	}
}
