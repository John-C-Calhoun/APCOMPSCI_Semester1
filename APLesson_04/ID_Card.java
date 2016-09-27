import java.util.Scanner;
public class ID_Card
{
	public static void main(String[]args)
	{
		ID_Card form = new ID_Card();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String fname = kb.nextLine();
		System.out.println("Enter your last name:");
		String lname = kb.nextLine();
		System.out.println("Enter your title:");
		String title = kb.nextLine();
		System.out.println("Enter the school site:");
		String site = kb.nextLine();
		System.out.println("Enter the school year:");
		String year = kb.nextLine();
		System.out.println("What is your subject?");
		String subject = kb.nextLine();
		
		System.out.println("***********************************");
		form.format(site, year);
		form.format(fname, lname);
		form.format(title, subject);
		System.out.println("***********************************");
	}
	public void format(String first, String second)
	{
		System.out.printf("* %12s %18s *\n", first, second);
	}

}