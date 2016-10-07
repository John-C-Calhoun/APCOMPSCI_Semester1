import java.util.Scanner;
public class Cube_2
{
	static double side;
	static double surface_area;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the length of one of the sides of your cube in inches: ");
		side = kb.nextDouble();
		kb.nextLine();
		
		calcSurf();
		print();
	}
	public static void calcSurf()
	{
		surface_area = Math.pow(side, 3)/12;
	}
	public static void print()
	{
		System.out.printf("The surface area of a cube whose sides are "+side+" inches in length is: %.5fft squared.", surface_area);
	}
}