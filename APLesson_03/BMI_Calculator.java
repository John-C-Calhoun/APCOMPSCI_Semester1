import java.util.Scanner;
public class BMI_Calculator
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your height in inches: ");
		double height = kb.nextDouble();
		System.out.println("Please enter your weight in pounds: ");
		double weight = kb.nextDouble();
		double BMI = ( weight/ ( height * height ) )*703;
		System.out.println("Your BMI is: "+BMI);
	}
}
