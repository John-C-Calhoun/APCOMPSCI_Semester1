import java.util.Scanner;
public class Reverse_Word
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String[] words = new String[5];
		System.out.println("Please enter five words: ");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.nextLine();
		}
		
		System.out.println("In order... ");
		
		for(String word: words)
		{
			System.out.print(word + " ");
		}
		System.out.println("");
		System.out.println("Reversed... ");
		reverse(words);
	}
	public static void reverse(String[] birds)
	{
		for(int k =birds.length - 1; k >= 0; k--)
		{
			System.out.print(birds[k] + " ");
		}
	}
}