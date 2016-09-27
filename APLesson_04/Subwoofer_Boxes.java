import java.util.Scanner;
public class Subwoofer_Boxes
{
	public static void main(String[]args)
	{
		Subwoofer_Boxes volume = new Subwoofer_Boxes();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the height in inches: ");
		double height = kb.nextDouble();
		System.out.println("");
		
		System.out.println("Enter the length in inches: ");
		double length = kb.nextDouble();
		System.out.println("");
		
		System.out.println("Enter width in inches: ");
		double width = kb.nextDouble();
		System.out.println("");
		
		double vol = volume.calcVol(height, length, width);
		System.out.printf("Your volume in feet is: %6.2fft cubed.", vol);
	}
	
	public double calcVol(double one, double two, double three)
	{
		return (one * two * three)/12;
	}
}