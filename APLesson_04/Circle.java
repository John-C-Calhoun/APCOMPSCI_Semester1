import java.util.Scanner;
public class Circle
{
	public static void main(String[]args)
	{
		Circle Area = new Circle();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the radius of your circle in feet: ");
		double r = kb.nextDouble();
		kb.nextLine();
		
		print(r, calcArea(r));
	}
	
	public static double calcArea(double r)
	{
		return 3.14*Math.pow(r, 2);
	}
	public static void print(double r, double area)
	{
		System.out.printf("The area of your circle with a radius of "+r+"ft is: %.5fft squared.", area);
	}
}