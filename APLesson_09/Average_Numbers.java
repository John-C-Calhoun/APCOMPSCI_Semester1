public class Average_Numbers
{
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		for(int num : numbers)
		{
			System.out.print(num + " ");
		}
		System.out.println("");
		System.out.println("The avergae of the above numbers is... " + average(numbers));
	}
	public static int average(int[] go)
	{
		int avg = 0;
		for(int g : go)
		{
			avg += g;
		}
		return avg/ 10;
	}
}