import java.util.Scanner;
public class Calculator
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your letter grade in English?");
		String eng = kb.nextLine();
		
		System.out.println("What is your letter grade in Math?");
		String math = kb.nextLine();
		
		System.out.println("What is your letter grade in Science?");
		String sci = kb.nextLine();
		
		System.out.println("What is your letter grade in History?");
		String hist = kb.nextLine();
		
		System.out.println("What is your letter grade in PE?");
		String pe = kb.nextLine();
		
		System.out.println("What is your letter grade in Acting?");
		String act = kb.nextLine();
		
		System.out.println("What is your letter grade in Band?");
		String band = kb.nextLine();
		
		double gPoints = calcPoints(sci) + calcPoints(math) + calcPoints(eng) + calcPoints(pe) + calcPoints(act) + calcPoints(band) + calcPoints(hist);
		double gpa = gPoints/7;
		
		System.out.printf("Your GPA is %.1f", gpa);
	}
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
			return 4.0;
		
		else if (grade.equals("B"))
			return 3.0;
		
		else if (grade.equals("C"))
			return 2.0;
		
		else if (grade.equals("D"))
			return 1.0;
		
		return 0.0;
	}
}