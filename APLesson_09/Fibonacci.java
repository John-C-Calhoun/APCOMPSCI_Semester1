import java.util.Scanner;
public class Fibonacci
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your starting number: ");
		int start = kb.nextInt();
		
		System.out.println("Please enter your sequence size: ");
		int length = kb.nextInt();
		
		int[] sequence = new int[length];
		for(int i = 0; i < sequence.length; i++)
		{
			if(i == 0 || i == 1)
			{
				sequence[i] = start;
			}
			else
			{
				sequence[i] = sequence[i - 1] + sequence[i - 2];
			}
			System.out.print(sequence[i] + " ");
		}
	}
}