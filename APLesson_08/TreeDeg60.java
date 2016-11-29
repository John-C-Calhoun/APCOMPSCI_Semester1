import java.util.Scanner;
public class TreeDeg60
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word");
		String input = kb.nextLine();
		
		int stop = input.length();
		int start = 0;
		
		tree(input, start, stop);
	}
	
	public static String tree(String word, int start, int stop)
	{
		if (start <= stop)
		{
			System.out.printf("%20s\n", word.substring(0, start));
			start ++;
			tree(word, start, stop);
		}
		return "";
	}
}