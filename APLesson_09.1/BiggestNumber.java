public class BiggestNumber
{
	static int[] numbers = new int[10];
	static int i;
	
	public static void main(String[]args)
	{
		fillArray();
	}
	public static void fillArray()
	{
		for(i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)((Math.random() * 100) + 1);
		}
		System.out.println("For the following numbers... ");
		printArray();
		System.out.println("\nThe biggest number is...");
		getBiggest();
	}
	public static void printArray()
	{
		for(int num : numbers)
		{
			System.out.print(num + " ");
		}
	}
	public static void getBiggest()
	{
		int max = 0;
		for(int big : numbers)
		{
			if(big > max)
				max = big;
		}
		System.out.println(max);
	}
}