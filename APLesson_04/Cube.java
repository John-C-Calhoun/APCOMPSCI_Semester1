import java.util.Scanner;
public class Cube
{
	public static void main(String[]args)
	{
		Cube Surface = new Cube();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the length of one of the sides of your cube in inches: ");
		double side = kb.nextDouble();
		kb.nextLine();
		
		print(side, calcSurf(side));
	}
	
	public static double calcSurf(double side)
	{
		return Math.pow(side, 3)/12;
	}
	public static void print(double side, double surface_area)
	{
		System.out.printf("The surface area of a cube whose sides are "+side+" inches in length is: %6.2fft squared.", surface_area);
	}
}