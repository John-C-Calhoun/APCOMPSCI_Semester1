import java.lang.Math.*;
public class Miles_Per_Hour
{
	private int distance, hours, minutes;
	private double mph;
	
	public Miles_Per_Hour()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	
	public Miles_Per_Hour(int dist, int hr, int min)
	{
		distance = dist;
		hours = hr;
		minutes = min;
		mph = 0;
	}
	
	public void setValues(int dist, int hr, int min)
	{
		distance = dist;
		hours = hr;
		minutes = min;
		mph = 0;
	}
	
	public double getMiles_Per_Hour()
	{
		return mph = Math.round(distance / (hours + minutes / 60.0));
	}
}