import java.util.Scanner;
public class Adventure_Game
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Someone has given you a magic ring that allows you to turn invisible. What will you use it for? Will you:");
		System.out.println("A: Use it to steal food.\nB: Use it to help others.");
		String answer1 = kb.nextLine();
		if (answer1.equals("A")||answer1.equals("a"))
		{
			System.out.println("The food vendor you are trying to steal from just so happens to be wearing magic glasses that allow them to see invisible people. You are discovered and two cops descend on you to take you to jail, but you still have your ring!. What will you do now?");
			System.out.println("A: Slip out of your cell\nB: Stay in your cell. Free meals and housing are great.");
			String answer3 = kb.nextLine();
			if (answer3.equals("A")||answer3.equals("a"))
				System.out.println("You slip out of your cell and head for the walls with the intent of scaling them, but you are quickly spotted as you had forgotten to put your ring on. As punishment for your attempted escape, you will be on poll duty for the next election, whereupon you will be shanked by an angry voter. GAME OVER");
			else
				System.out.println("You wait out the remaining two days of your sentence in your cell. Upon release, you repent your sins and become a Confuscious Monk. END");
		}
		else
		{
			System.out.println("You leave your house with the glorious intent of helping others. Will you go to the park and help someone there, or will you go to the town hall and offer your services?");
			System.out.println("A: Go to the park\nB: Go to the town hall");
			String answer2 = kb.nextLine();
			if (answer2.equals("A")||answer2.equals("a"))
			{
				System.out.println("You go to a park and hear a shrill scream. A woman's purse is being stolen! You stick your invisible foot out and trip her assailant as he flees. She offers you her first born son as thanks. Do you accept?");
				System.out.println("A: You better believe it! I've always wanted a little bro!\nB: Jesus Christ! No I don't want your first born son!");
				String answer4 = kb.nextLine();
				if (answer4.equals("A")||answer4.equals("a"))
					System.out.println("You take the woman's son and decide to teach him martial arts. You did it! You have saved the day! END");
				else
					System.out.println("You leave the park and go home. Helping people is too much work, you decide. Time to go to bed. END");
			}
			else
				System.out.println("While crossing the street to reach the town hall you are hit by an airplane. Next time, don't be such a good-ie two shoes. GAME OVER");
		}
	}
}