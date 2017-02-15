public abstract class GameSystem
{
	private String platform;
	private int serialNo;
	
	public GameSystem()
	{
		platform = "";
		serialNo = 1;
	}
	public GameSystem(String p)
	{
		platform = p;
		serialNo = (int)((Math.random() * 7) + 1);
	}
	public String getPlatform()
	{
		return platform;
	}
	public int getSerialNo()
	{
		return serialNo;
	}
	public String toString()
	{
		return "Platform: " + platform + "\n" + "Serial #: " + serialNo;
	}
}