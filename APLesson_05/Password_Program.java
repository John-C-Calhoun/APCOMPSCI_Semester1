import java.util.Scanner;
public class Password_Program
{
	static String username;
	static String password;
	
	//The username is Michael
	//The password is McMahon
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your Username: ");
		username = kb.nextLine();
		
		System.out.println("Please enter your password: ");
		password = kb.nextLine();
		
		passCheck();
	}
	public static void passCheck()
	{
		if (username.equals("Michael") && password.equals("McMahon"))
			System.out.println("You are granted access!");
		else if (username.equals("Michael"))
			System.out.println("Your password is incorrect!");
		else if (password.equals("McMahon"))
			System.out.println("Your username is incorrect!");
		else
			System.out.println("Your username and password are incorrect!");
	}
}