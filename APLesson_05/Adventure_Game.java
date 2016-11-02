import java.util.Scanner;
public class Adventure_Game
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Someone has given you a magic ring that allows you to turn invisible. What will you use it for? Will you:");
		System.out.println("A: Use it to steal food.\nB: Use it to help others.");
		String answer1 = kb.nextLine();
		if (answer1 == "A")
			System.out.println("The food vendor you are trying to steal from just so happens to be wearing magic glasses that allow them to see invisible people. You are discovered and two cops descend on you to take you to jail. Your mother will not be happy. GAME OVER");
		else
		{
			System.out.println("You leave your house with the glorious intent of helping others. Will you go to the park and help someone there, or will you go to your town hall and offer your assistance?");
			System.out.println("A: Go to the park\nB: Go to the town hall");
			String answer2 = kb.nextLine();
			if (answer2 == "A")
			{
				System.out.println("You go to a park and help a woman who's purse had been stolen by tipping your invisible foot out and tripping her assailant as he flees. She offers you her first born son as thanks. Do you accept?");
				System.out.println("A: You better believe it! I've always wanted a little bro!\nB: Jesus Christ! No I don't want your first born son!");
				String answer3 = kb.nextLine();
				if (answer3 == "A")
					System.out.println("You take the woman's son and decide to teach him martial arts. You did it! You have saved the day! END");
				else
					System.out.println("You leave the park and go home. Helping people is too much work, you decide. Time to go to bed. END");
			}
			else
				System.out.println("While crossing the street to reach the town hall you are hit by an airplane. Next time, don't be such a good-ie two shoes. GAME OVER");
		}
	}
}