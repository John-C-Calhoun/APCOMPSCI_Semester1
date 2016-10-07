import java.util.Scanner;
public class Average_2
{
	static double num1, num2, num3;
	static double avg;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your first number: ");
		num1 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Enter your second number: ");
		num2 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Enter your third number: ");
		num3 = kb.nextDouble();
		kb.nextLine();
		
		calcAvg();
		print();
	}
	public static void calcAvg()
	{
		avg = (num1 + num2 + num3)/3;
	}
	public static void print()
	{
		System.out.printf("The average of "+num1+", "+num2+", and "+num3+" is %.5f.", avg);
	}
}