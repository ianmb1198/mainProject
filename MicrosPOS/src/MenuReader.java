
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MenuReader 
{
	private final int LENGTH = 10;
	int size;
	private Menu[] menu = new Menu[LENGTH];
	private Beverage bev;
	private Appetizer app;
	private Lunch lunch;
	private Dinner dinner;
	//TODO: add dessert
	
	public void readFile()
	{
		Scanner cin = new Scanner(System.in);
		Scanner fileIn = null;
		
		
		String[] items = new String[LENGTH];
		String[] types = new String[LENGTH];
		double[] prices = new double[LENGTH];
		
		try
		{
			fileIn = new Scanner(new FileInputStream("menu.txt"));
		} catch (FileNotFoundException e)
		{
			System.out.println("File not found.");
			System.exit(0);
		}
		
		int index = 0;
		String menu = null;
		while (fileIn.hasNext())
		{
			menu = fileIn.nextLine();
			String[] strSplit = menu.split(",");
			items[index] = strSplit[0];
			prices[index] = Double.parseDouble(strSplit[1]);
			types[index] = strSplit[2];
			index++;
		}
		
		for (index = 0; index < LENGTH; index++)
		{
			if (isBeverage(types, index))
			{
				setBeverage(items, prices, index);
				size++;
			}
			else if (isAppetizer(types, index))
			{
				setAppetizer(items, prices, index);
				size++;
			}
			else if (isLunch(types, index))
			{
				setLunch(items, prices, index);
				size++;
			}
			else if (isDinner(types, index))
			{
				setDinner(items, prices, index);
				size++;
			}
			else
				continue;
					
		}
	}
	
	public boolean isBeverage(String[] type, int i)
	{
		if (type[i].contentEquals("Bev"))
			return true;
		else
			return false;
	}
	public boolean isAppetizer(String[] type, int i)
	{
		if (type[i].contentEquals("App"))
			return true;
		else
			return false;
	}
	public boolean isLunch(String[] type, int i)
	{
		if (type[i].contentEquals("Lunch"))
			return true;
		else
			return false;
	}
	public boolean isDinner(String[] type, int i)
	{
		if (type[i].contentEquals("Dinner"))
			return true;
		else 
			return false;
	}
	
	public void setBeverage(String[] item, double[] price, int i)
	{
		bev = new Beverage(item[i], price[i]);
		menu[i] = bev;
	}
	public void setAppetizer(String[] item, double[] price, int i)
	{
		app = new Appetizer(item[i], price[i]);
		menu[i] = app;
	}
	public void setLunch(String[] item, double[] price, int i)
	{
		lunch = new Lunch(item[i], price[i]);
		menu[i] = lunch;
	}
	public void setDinner(String[] item, double[] price, int i)
	{
		dinner = new Dinner(item[i], price[i]);
		menu[i] = dinner;
	}
	
	public String toString()
	{
		String items = "";
		for (int i = 0; i < size; i++)
			items += ((i+1 + ". " + menu[i] + "\n"));
		return items;
	}
}
