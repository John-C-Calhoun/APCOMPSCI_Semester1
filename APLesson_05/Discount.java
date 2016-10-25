import java.util.Scanner;
public class Discount
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter item one: ");
		String item1 = kb.nextLine();
		System.out.println("Please enter the price of item one: ");
		Double price1 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter item two: ");
		String item2 = kb.nextLine();
		System.out.println("Please enter the price of item two: ");
		Double price2 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter item three: ");
		String item3 = kb.nextLine();
		System.out.println("Please enter the price of item three: ");
		Double price3 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter item four: ");
		String item4 = kb.nextLine();
		System.out.println("Please enter the price of item four: ");
		Double price4 = kb.nextDouble();
		kb.nextLine();
		
		double subtotal = price1+price2+price3+price4;
		double discount = calcDisc(subtotal);
		double tax = subtotal * 0.08;
		double total = subtotal - discount + tax;
		
		System.out.printf("<<<<<<<<<<<<<<< Receipt >>>>>>>>>>>>>>>");
		System.out.println("");
		format(item1, price1);
		format(item2, price2);
		format(item3, price3);
		format(item4, price4);
		format("Subtotal: ", subtotal);
		format("Discount: ", discount);
		format("Tax: ", tax);
		format("Total: ", total);
		System.out.printf("_________________________________________\n");
		System.out.println("* Hey man, thanks.");
	}
	public static double calcDisc(double subtotal)
	{
		if (subtotal >= 2000)
			return subtotal * 0.15;
		return 0.0;
	}
	public static void format(String item, double price)
	{
		System.out.printf("%14s .......... %.2f\n", item, price);
	}
}