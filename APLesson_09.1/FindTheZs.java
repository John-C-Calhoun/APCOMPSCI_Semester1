import java.util.Scanner;
public class FindTheZs
{
	static String[] words = new String[5];
	
	public static void main(String[]args)
	{
<<<<<<< HEAD
=======
		Scanner kb = new Scanner(System.in);
>>>>>>> 058aebfff15f748c7949bd2f3341e0831a6e5815
		
		System.out.println("Please enter five words: ");
		
		fillArray();
<<<<<<< HEAD
		
		System.out.print("For the following words: ");
		printArray();
		System.out.println("\nOnly " + hasZs() + " contatin(s) the letter z.");
	}
	public static void fillArray()
	{
		Scanner kb = new Scanner(System.in);
		for(int i = 0; i < words.length; i++)
=======
	}
	public static void fillArray()
	{
		for(int i = 0; i = words.length; i++)
>>>>>>> 058aebfff15f748c7949bd2f3341e0831a6e5815
		{
			words[i] = kb.nextLine();
		}
	}
<<<<<<< HEAD
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
=======
	public static void hasZs()
	{
		
>>>>>>> 058aebfff15f748c7949bd2f3341e0831a6e5815
	}
}