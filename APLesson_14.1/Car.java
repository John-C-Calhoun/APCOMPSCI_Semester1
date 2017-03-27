public class Car implements Location
{
	static double[] location;
	static int PFIID;
	
	public Car()
	{
		location = new double[2];
		PFIID = (int)((Math.random() * 10000000) + 1);
	}
	public int getID()
	{
		return PFIID;
	}
	public void move(double x, double y)
	{
		location[0] += x;
		location[1] += y;
	}
	public double[] getLoc()
	{
		return location;
	}
}