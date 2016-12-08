import java.util.Scanner;
public class FindTheZs
{
	static String[] words = new String[5];
	
	public static void main(String[]args)
	{
		
		System.out.println("Please enter five words: ");
		
		fillArray();
		
		System.out.print("For the following words: ");
		printArray();
		System.out.println("\nOnly " + hasZs() + " contatin(s) the letter z.");
	}
	public static void fillArray()
	{
		Scanner kb = new Scanner(System.in);
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.nextLine();
		}
	}
	public static void printArray()
	{
		for(String word : words)
		{
			System.out.print(word + " ");
		}
	}
	public static String hasZs()
	{
		String zs = "";
		for(String word : words)
		{
			if(word.indexOf("z") >= 0 || word.indexOf("Z") >= 0)
				zs += word;
		}
		return zs;
	}
}