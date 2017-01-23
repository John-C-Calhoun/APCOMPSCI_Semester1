public class Inventory
{
	static private String maker;
	static private String item;
	static private String category;
	static private int UPC;
	static private String price;
	
	public Inventory()
	{
		maker = "";
		item = "";
		category = "";
		UPC = 0;
		price = "";
	}
	public Inventory(String m, String i)
	{
		maker = m;
		item = i;
		category = "undeclared";
		price = "undeclared";
		
		UPC = (int)(Math.random() * 1000000000) + 1;
	}
	public Inventory(String m, String i, String cat, String p)
	{
		maker = m;
		item = i;
		category = cat;
		UPC = (int)(Math.random() * 1000000000) + 1;
		price = p;
	}
	public void setValues(String m, String i, String cat, String p)
	{
		maker = m;
		item = i;
		category = cat;
		UPC = (int)(Math.random() * 1000000000) + 1;
		price = p;
	}
	public String toString()
	{
		return "Item Info...\nItem name: " + item + 
							"\nItem manufactorer: " + maker + 
							"\nItem category: " + category + 
							"\nItem price: " + price + 
							"\nItem UPC#: " + UPC;
	}
}