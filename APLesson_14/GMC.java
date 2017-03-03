public class GMC implements Location
{
	private double Xcoordinate;
	private double Ycoordinate;
	
	public GMC()
	{
		Xcoordinate = 0;
		Ycoordinate = 0;
	}
	public GMC(double x, double y)
	{
		Xcoordinate = 0;
		Ycoordinate = 0;
		move(x, y);
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
		location[0] = Xcoordinate;
		location[1] = Ycoordinate;
		return location;
	}
}