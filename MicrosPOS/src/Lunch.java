
public class Lunch extends Menu
{
	private double price;
	private String item;
	
	public Lunch(String type, String item, double price)
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
		String lunchInfo = item + "\t$" + price;
		return lunchInfo;
	}
}
