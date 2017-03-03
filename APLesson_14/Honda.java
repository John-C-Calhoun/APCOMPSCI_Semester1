public class Honda implements Location
{
	private double Xcoordinate;
	private double Ycoordinate;
	
	public Honda()
	{
		Xcoordinate = 0;
		Ycoordinate = 0;
	}
	public Honda(double[] honLoc)
	{
		Xcoordinate = 0;
		Ycoordinate = 0;
		move(honLoc[0], honLoc[1]);
	}
	public int getID()
	{
		return (int)(Math.random() * 1000000) + 1;
	}
	public void move(double x, double y)
	{
		Xcoordinate = x;
		Ycoordinate = y;
	}
	public double[] getLoc()
	{
		double[] location = new double[2];
		location[0] += Xcoordinate;
		location[1] += Ycoordinate;
		return location;
	}
}