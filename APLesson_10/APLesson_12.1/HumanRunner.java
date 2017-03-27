import java.util.Scanner;
public class HumanRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a hair color: ");
		String hair = kb.nextLine();
		
		System.out.println("Please enter an eye color: ");
		String eyes = kb.nextLine();
		
		System.out.println("Please enter a skin type: ");
		String skin = kb.nextLine();
		
		Human object = new Human(hair, eyes, skin);
		
		System.out.println();
		System.out.println("My info...");
		System.out.println("Hair: " + object.getHair());
		System.out.println("Eyes: " + object.getEyes());
		System.out.println("Skin: " + object.getSkin());
		
		System.out.println();
		System.out.println("Now let your friend try!");
		
		System.out.println("Please enter a hair color: ");
		hair = kb.nextLine();
		
		System.out.println("Please enter an eye color: ");
		eyes = kb.nextLine();
		
		System.out.println("Please enter a skin type: ");
		skin = kb.nextLine();
		
		Human object2 = new Human(hair, eyes, skin);
		
		System.out.println();
		System.out.println("My friend's info...");
		System.out.println("Hair: " + object2.getHair());
		System.out.println("Eyes: " + object2.getEyes());
		System.out.println("Skin: " + object2.getSkin());
	}
}