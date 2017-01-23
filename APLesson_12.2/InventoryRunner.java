import java.util.Scanner;
public class InventoryRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Will you be entering the category and price information?");
		System.out.println("[1] Yes");
		System.out.println("[2] No");
		int response = kb.nextInt();
		kb.nextLine();
		if(response == 1)
		{
			System.out.println("What is the name of the item?");
			String i = kb.nextLine();
			System.out.println("What is its manufactorer?");
			String m = kb.nextLine();
			System.out.println("What is the category of the item?");
			String cat = kb.nextLine();
			System.out.println("What is the price of the item?");
			String p = kb.nextLine();
			Inventory object = new Inventory(m, i, cat, p);
			System.out.println(object);
		}
		else if(response == 2)
		{
			System.out.println("What is the name of the item?");
			String i = kb.nextLine();
			System.out.println("What is its manufactorer?");
			String m = kb.nextLine();
			Inventory object = new Inventory(m, i);
			System.out.println(object);
		}
		else
		{
			System.out.println("Try again, loser!");
		}
	}
}