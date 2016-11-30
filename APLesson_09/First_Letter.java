import java.util.Scanner;
public class First_Letter
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String[] words= new String[5];
		
		System.out.println("Please enter 5 words: ");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.nextLine();
		}
		
		System.out.println("The first letters in the words you entered are: ");
		first(words);
		System.out.println("");
	}
	public static void first(String[] s)
	{
		for(String n : s)
		{
			char a = n.charAt(0);
			System.out.print(a + " ");
		}
	}
}