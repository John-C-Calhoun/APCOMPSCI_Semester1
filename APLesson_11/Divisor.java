import java.util.Scanner;
public class Divisor
{
	static int i;
	static int j;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		int[][] nums = new int [4][4];
		
		for(i = 0; i < nums.length; i++)
		{
			for(j = 0; j < nums[i].length; j++)
			{
				nums[i][j] = (int)((Math.random() * 100) + 1);
			}
		}
		for(i = 0; i < nums.length; i++)
		{
			for(j = 0; j < nums[i].length; j++)
			{
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("Please enter a number: ");
		int count = 0;
		int divisor = kb.nextInt();
		for(i = 0; i < nums.length; i++)
		{
			for(j = 0; j < nums[i].length; j++)
			{
				if(nums[i][j] % divisor == 0)
					count++;
			}
		}
		System.out.println("There are " + count + " numbers divisible by " + divisor + " in the Array.");
	}
}