import java.util.Scanner;
public class Graph_Table
{
	static int n = 5;
	static int i;
	static String X;
	static String Y;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("How many values should your table have?");
		int num1 = kb.nextInt();
		kb.nextLine();
		
		System.out.println("Please enter an integer to start from:");
		int num2 = kb.nextInt();
		kb.nextLine();
		
		System.out.printf("X | Y\n");
		
		for(i = 0; i <= num1; i++)
		{
		int num3 = (num2 + i);
		int num4 = (num3 * n);
		System.out.printf(num3 + " | " + num4 + "\n");
		}
	}
}