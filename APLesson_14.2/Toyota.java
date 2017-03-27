public class Toyota extends Car
{
	public Toyota()
	{
		super();
	}
	public Toyota(String loc)
	{
		super();
		String[] location = loc.split(", ");
		move(Double.parseDouble(location[0]), Double.parseDouble(location[1]));
	}
	
}