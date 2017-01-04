import java.util.Scanner;
public class Strings
{
	static int i;
	static int j;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 16 words:");
		
		String[][]words = new String [4][4];
		
		for(i = 0; i < words.length; i++)
		{
			for(j = 0; j < words[i].length; j++)
			{
				words[i][j] = kb.next();
			}
		}
		for(i = 0; i < words.length; i++)
		{
			for(j = 0; j < words[i].length; j++)
			{
				System.out.print(words[i][j] + "\t");
			}
			System.out.println();
		}
	}
}