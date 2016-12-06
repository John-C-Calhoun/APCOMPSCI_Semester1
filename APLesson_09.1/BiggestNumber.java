public class BiggestNumber
{
	static int[] Array = new int[10];
	
	public static void main(String[]args)
	{
		fillArray();
	}
	public static void fillArray()
	{
		for(int i = 0; i < Array.length; i++)
		{
			Array[i] = (int)((Math.random() * 100) + 1);
		}
		System.out.println("For the following numbers... ");
		printArray();
		System.out.println("Their biggest number is...");
		getBiggest();
	}
	public static void printArray()
	{
		for(int a : Array)
		{
			System.out.print(a + " ");
		}
	}
	public static void getBiggest()
	{
		int max;
		for(int big : Array)
		{
			if(big > max)
				max = big;
		}
		System.out.print(big);
	}
}