import java.util.Scanner;
public class Right_Triangle
{
	static int i;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word = kb.nextLine();
		
		for(i= word.length(); i >= 0; i--)
		{
			System.out.println(word.substring(i));
		}
	}
}