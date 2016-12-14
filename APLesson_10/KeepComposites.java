import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class KeepComposites
{
	static Integer[] numbers = {2, 6, 8, 9, 10, 12, 13, 15, 17, 24, 55, 66, 78, 77, 79};
	static ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(numbers));
	
	public static void main(String[]args)
	{
		System.out.println("All numbers: ");
		System.out.println(nums);
		removePrimes();
		System.out.println("Composite numbers: ");
		System.out.println(nums);
	}
	public static int gFactor(int n)
	{
		for(int k = 2; k < n; k++)
		{
			if(n % k == 0)
				return 1;
		}
		return 0;
	}
	public static void removePrimes()
	{
		for(int i = 0; i < nums.size(); i++)
		{
			if(gFactor(nums.get(i)) == 0)
			{
				nums.remove(i);
			}
		}
	}
}