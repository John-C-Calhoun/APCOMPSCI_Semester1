public class Dice
{
	static double player;
	static double computer;
	static String winner;
	
	public static void main(String[]args)
	{
		player = (Math.random()*6)+1;
		computer = (Math.random()*6)+1;
		diceRoll();
		System.out.println("Your rolled a " + player + "!");
		System.out.println("The computer rolled a " + computer + "!");
		System.out.println("The winner is " + winner + "!");
	}
	public static void diceRoll()
	{
		if(player > computer)
			winner = "man";
		
		if(player < computer)
			winner = "machine";
	}
}