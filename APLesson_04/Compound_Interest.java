import java.util.Scanner;
public class Compound_Interest
{
	public static void main(String[]args)
	{
		Compound_Interest average = new Compound_Interest();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your interest rate: ");
		double rate = kb.nextDouble();
		System.out.println("");
		
		System.out.println("Enter your principal: ");
		double principal = kb.nextDouble();
		System.out.println("");
		
		System.out.println("Enter your number of times the loan has been compounded: ");
		double number = kb.nextDouble();
		System.out.println("");
		
		System.out.println("Enter the life of the loan: ");
		double time = kb.nextDouble();
		System.out.println("");
		
		double avg = average.calcAvg(rate, principal, number, time);
		System.out.printf("Your total monthly payment is: %6.2f", avg);
	}
	
	public double calcAvg(double one, double two, double three, double four)
	{
		return (two*Math.pow((1+(one/three)), three*four))/(12*four);
	}
}