import java.util.Scanner;
public class Average
{
	public static void main(String[]args)
	{
		Average average = new Average();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your first number: ");
		double num1 = kb.nextDouble();
		System.out.println("");
		
		System.out.println("Enter your second number: ");
		double num2 = kb.nextDouble();
		System.out.println("");
		
		System.out.println("Enter your third number: ");
		double num3 = kb.nextDouble();
		System.out.println("");
		
		print(num1, num2, num3, calcAvg(num1, num2, num3));
	}
	
	public static double calcAvg(double num1, double num2, double num3)
	{
		return (num1 + num2 + num3)/3;
	}
	public static void print(double num1, double num2, double num3, double calcAvg)
	{
		System.out.printf("The average of "+num1+", "+num2+", and "+num3+" is: %.5f.", calcAvg);
	}
}