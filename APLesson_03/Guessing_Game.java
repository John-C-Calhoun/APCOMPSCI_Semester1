import java.util.Scanner;
public class Guessing_Game
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("whatever integer you choose, I can make it three using a single formula.");
		System.out.println("Choose any integer:");
		double number1 = kb.nextDouble();
		System.out.println("Multiply it by two:");
		kb.nextDouble();
		System.out.println("Add six:");
		kb.nextDouble();
		System.out.println("Divide it by two:");
		kb.nextDouble();
		System.out.println("Subtract this number by the number that you first chose:");
		kb.nextDouble();
		double number6 = (((number1 *2)+6)/2)-number1;
		System.out.println("Your number is "+number6+". Do you want to try again?");
		kb.nextLine();
		String answer7 = kb.nextLine();
	}
}