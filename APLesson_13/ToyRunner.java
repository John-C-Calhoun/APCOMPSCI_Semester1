import java.util.Scanner;
public class ToyRunner
{
	public static void main(String[]args)
	{
		AFigure bob = new AFigure("Bob the Builder");
		Car lightning = new Car("McQueen");
		
		System.out.println(bob);
		System.out.println(lightning);
	}
}