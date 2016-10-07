import java.util.Scanner;
public class Rectangle
{
	public static void main(String[]args)
	{
		Rectangle Perimeter = new Rectangle();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the length in inches: ");
		double length = kb.nextDouble();
		System.out.println("");
		
		System.out.println("Enter width in inches: ");
		double width = kb.nextDouble();
		kb.nextLine();
		
		print(calcPerim(length, width));
	}
	
	public static double calcPerim(double l, double w)
	{
		return (l + w)/6;
	}
	public static void print(double perimeter)
	{
		System.out.printf("Your rectangle is: %.5fft around.", perimeter);
	}
}