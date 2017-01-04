public class Xs_and_Os
{
	static int i;
	static int j;
	static int pick;
	
	public static void main(String[]args)
	{
		String[][]xAndO = new String[4][4];
		for(i = 0; i < xAndO.length; i++)
		{
			for(j = 0; j < xAndO[i].length; j++)
			{
				pick = (int)((Math.random() * 2) + 1);
				if(pick == 1)
					xAndO[i][j] = "O";
				else
					xAndO[i][j] = "X";
			}
		}
		for(i = 0; i < xAndO.length; i++)
		{
			for(j = 0; j < xAndO[i].length; j++)
			{
				System.out.print(xAndO[i][j] + "\t");
			}
			System.out.println();
		}
	}
}