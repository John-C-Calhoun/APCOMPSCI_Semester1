import java.util.Scanner;
public class Lesson_04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Lesson_04 form = new Lesson_04();
		
		System.out.println("Please enter item 1: ");
		String item1 = kb.nextLine();
		System.out.println("Please enter the price: ");
		double price1 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter item 2: ");
		String item2 = kb.nextLine();
		System.out.println("Please enter the price: ");
		double price2 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter item 3: ");
		String item3 = kb.nextLine();
		System.out.println("Please enter the price: ");
		double price3 = kb.nextDouble();
		kb.nextLine();
		
		double price4 = price1+price2+price3;
		double price5 = price4 * 0.1;
		double price6 = price4+price5;
		String item4 = "Subtotal:";
		String item5 = "Tax:";
		String item6 = "Total";		
		
		System.out.printf("<<<<<<<<<<<__Receipt__>>>>>>>>>>>");
		System.out.println("");
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		System.out.println("");
		form.format(item4, price4);
		form.format(item5, price5);
		form.format(item6, price6);
		
	}
	
	public void format(String item, double price)
	{
		System.out.printf("\n%30s ........%30.2f", item, price);
	}
	
}