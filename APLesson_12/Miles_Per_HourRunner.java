import java.util.Scanner;
public class Miles_Per_HourRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the distance in miles: ");
		int distance = kb.nextInt();

		System.out.println("Please enter the number of hours it takes to travel the distance: ");
		int hours = kb.nextInt();

		System.out.println("And the minutes: ");
		int minutes = kb.nextInt();

		Miles_Per_Hour object = new Miles_Per_Hour(distance, hours, minutes);

		System.out.println(distance + " miles in " + hours + " hours and " + minutes + " minutes is " + object.getMiles_Per_Hour() + " mph.");
		
		System.out.println("Please enter the distance in miles: ");
		distance = kb.nextInt();

		System.out.println("Please enter the number of hours it takes to travel the distance: ");
		hours = kb.nextInt();

		System.out.println("And the minutes: ");
		minutes = kb.nextInt();
		
		object.setValues(distance, hours, minutes);
		System.out.println(distance + " miles in " + hours + " hours and " + minutes + " minutes is " + object.getMiles_Per_Hour() + " mph.");
	}
}