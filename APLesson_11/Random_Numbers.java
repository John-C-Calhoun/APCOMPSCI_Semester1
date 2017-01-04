public class Random_Numbers
{
	static int i;
	static int j;
	
	public static void main(String[]args)
	{
		int[][]nums = new int [4][4];
		for(i = 0; i < nums.length; i++)
		{
			for(j = 0; j < nums[i].length; j++)
			{
				nums[i][j] = (int)(1 + (Math.random() * 100));
			}
		}
		for(i = 0; i < nums.length; i++)
		{
			for(j = 0; j < nums[i].length; j++)
			{
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}
	}
}