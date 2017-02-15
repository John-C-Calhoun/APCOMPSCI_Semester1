public class GameRunner
{
	public static void main(String[]args)
	{
		PlayStation ps4 = new PlayStation("PS4");
		System.out.println(ps4);
		System.out.println();
		
		Xbox xbx = new Xbox("XBox");
		System.out.println(xbx);
		System.out.println();
		
		PC pc = new PC("PC");
		System.out.println(pc);
	}
}