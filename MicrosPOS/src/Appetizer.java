import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Appetizer
{
	
	public Appetizer()
	{
		appReader();
	}
	
	public void appReader()
	{
		Scanner cin = new Scanner(System.in);
		Scanner fileIn = null;
		String[] item = new String[8];
		double[] price = new double[8];
		
		try
		{
			fileIn = new Scanner(new FileInputStream("Appetizer.txt"));
		} catch (FileNotFoundException e)
		{
			System.out.println("\nFile Not Found...\n");
		}
		
		int index = 0;
		String appMenu = null;
		while (fileIn.hasNext())
		{
			appMenu = fileIn.nextLine();
			String[] strSplit = appMenu.split(",");
			item[index] = strSplit[0];
			price[index] = Double.parseDouble(strSplit[1]);
			index++;
		}
		
		System.out.println("***Appetizers***");
		for (int i = 0; i < 8; i++)
		{
			System.out.println((i + 1) + ". " + item[i] + " $" + price[i]);
		}
		System.out.println("****************");
		System.out.print("--> ");
		int appChoice = cin.nextInt();
		cin.nextLine();
		
		String itemOfChoice = item[appChoice - 1];
		double priceOfItem = price[appChoice - 1];
		
		
		//TabWriter(item, price, appChoice);
		
	}	
}
