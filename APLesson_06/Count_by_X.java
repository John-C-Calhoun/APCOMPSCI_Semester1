import java.util.Scanner;
public class Count_by_X
{
	static int to;
	static int by;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What number do you want to count up to?");
		to = kb.nextInt();
		
		System.out.println("By increments of what number do you want to count?");
		by = kb.nextInt();
		
		for(int i = by; i <= to; i += by)
		{
			System.out.print(i + " ");
		}
	}
}