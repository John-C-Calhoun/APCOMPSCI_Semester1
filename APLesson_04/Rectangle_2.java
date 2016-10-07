import java.util.Scanner;
public class Rectangle_2
{
	static double l, w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the length in inches: ");
		l = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Enter width in inches: ");
		w = kb.nextDouble();
		kb.nextLine();
		
		calcPerim();
		print();
	}
	public static void calcPerim()
	{
		perimeter = (l + w)/6;
	}
	public static void print()
	{
		System.out.printf("The perimeter of the rectangle is %.5fft.", perimeter);
	}
}