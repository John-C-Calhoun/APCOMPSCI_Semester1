public class GetOdds
{
	static int[] Array = new int[10];
	
	public static void main(String[]args)
	{
		fillArray();
	}
	public static void fillArray()
	{
		for(int i = 0; i < 10; i++)
		{
			Array[i] = (int)((Math.random() * 100) + 1);
		}
		System.out.println("For the following numbers... ");
		printArray();
		System.out.println("The odd numbers are... ");
		getOdds();
	}
	public static void printArray()
	{
		for(int a : Array)
		{
			System.out.print(a + " ");
		}
		System.out.println();
	}
	public static void getOdds()
	{
		for(int b : Array)
		{
			if(b % 2 == 1)
			{
				System.out.print(b + " ");
			}
		}
	}
}