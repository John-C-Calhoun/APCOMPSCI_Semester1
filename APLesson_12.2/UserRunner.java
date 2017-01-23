import java.util.Scanner;
public class UserRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a first name: ");
		String firstName = kb.nextLine();
		
		System.out.println("Please enter a last name: ");
		String lastName = kb.nextLine();
		
		System.out.println("Would you like an avatar name?");
		System.out.println("[1] Yes");
		System.out.println("[2] No");
		int answer = kb.nextInt();
		kb.nextLine();
		
		if(answer == 1)
		{
			System.out.println("Please enter an avatar name: ");
			String avatar = kb.nextLine();
			User object = new User(firstName, lastName, avatar);
			System.out.println(object);
		}
		else if(answer == 2)
		{
			User object = new User(firstName, lastName);
			System.out.println(object);
		}
		else
			System.out.println("Hey man, try again!");
	}
}