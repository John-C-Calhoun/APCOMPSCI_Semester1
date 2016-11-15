import java.util.Scanner;
public class Factorial
{
	static int num;
	static int n = 1;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		num = kb.nextInt();
		kb.nextLine();
		
		for(n = num-1; n >= 1; n--)
		{
		num = (num * n);
		}
		print();
	}
	public static void print()
	{
		System.out.println("The factorial of your number is: " + num);
	}
}