import java.util.Scanner;
public class Circle_2
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the radius of your circle in feet: ");
		r = kb.nextDouble();
		kb.nextLine();
		
		calcArea();
		print();
	}
	public static void calcArea()
	{
		area = 3.14*Math.pow(r, 2);
	}
	public static void print()
	{
		System.out.printf("The area of your circle with a radius of "+r+"ft is: %.5fft squared.", area);
	}
}