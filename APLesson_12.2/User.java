public class User
{
	static private String firstName;
	static private String lastName;
	static private String avatar;
	static private int userID;
	
	public User()
	{
		firstName = "";
		lastName = "";
		avatar = "";
		userID = 0;
	}
	public User(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		avatar = "undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	public User(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	public void setValues(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	public String toString()
	{
		return "Customer Info...\nFirst Name: " + firstName + 
								"\nLast Name: " + lastName + 
								"\nAvatar: " + avatar + 
								"\nUser ID#: " + userID;
	}
}