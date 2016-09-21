import java.util.Scanner;
public class RudeAI
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your name?");
		
		String answer1 = kb.nextLine();
		System.out.println( answer1 + "? Wow what a stupid name.");
		System.out.println("How old are you?");
		int age = kb.nextInt();
		kb.nextLine();
		System.out.println("Wow! I wish I was "+age+"!");
		System.out.println("What do you do for fun?");
		String doing = kb.nextLine();
		System.out.println("That sounds pretty boring.");
		System.out.println("What kind of music do you like?");
		String answer2 = kb.nextLine();
		System.out.println( answer2 + "? Never heard of it.");
		System.out.println("How many siblings do you have?");
		int answer3 = kb.nextInt();
		kb.nextLine();
		System.out.println("Man that blows. That sounds like "+answer3+" too many.");
		System.out.println("What do you want to be when you grow up?");
		String answer4 = kb.nextLine();
		System.out.println("You've got to be pretty stupid to want to be a...what was it? "+answer4+"? Whatever you say pal.");
		System.out.println("See you later loser. AI out.");
	}
}