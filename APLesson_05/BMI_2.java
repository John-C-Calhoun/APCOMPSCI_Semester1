import java.util.Scanner;
public class BMI_2
{
	static double height;
	static double weight;
	static double bmi;
	static String condition;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your height?");
		height = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("What is your weight?");
		weight = kb.nextDouble();
		kb.nextLine();
		
		bmi = ( weight/ ( height * height ) )*703;
		
		calcCondish();
		print();
	}
	public static String calcCondish()
	{
		if (bmi < 18.5)
			return condition = "Underweight";
		else if (bmi < 25)
			return condition = "Normal";
		else if (bmi < 29.9)
			return condition = "Overweight";
		else if (bmi < 34.9)
			return condition = "Obese";
		else if (bmi < 39.9)
			return condition = "Very Obese";
		else
			return condition = "Morbidly Obese";
	}
	public static void print()
	{
		System.out.println("Your BMI is: " + bmi);
		System.out.println("You are " + condition);
	}
}