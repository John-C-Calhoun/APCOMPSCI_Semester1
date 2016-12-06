import java.util.Scanner;
public class FindTheZs
{
	static String[] words = new String[5];
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter five words: ");
		
		fillArray();
	}
	public static void fillArray()
	{
		for(int i = 0; i = words.length; i++)
		{
			words[i] = kb.nextLine();
		}
	}
	public static void hasZs()
	{
		
	}
}