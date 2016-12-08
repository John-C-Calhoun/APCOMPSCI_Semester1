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
		System.out.println("\nTheir biggest number is...");
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
<<<<<<< HEAD
		int max = 0;
		for(int num : numbers)
		{
			if(num > max)
				max = num;
		}
		System.out.println(max);
=======
		int max;
		for(int big : Array)
		{
			if(big > max)
				max = big;
		}
		System.out.print(big);
>>>>>>> 058aebfff15f748c7949bd2f3341e0831a6e5815
	}
}