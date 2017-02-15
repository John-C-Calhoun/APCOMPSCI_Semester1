import java.util.ArrayList;
public class ToyStore
{
	private ArrayList<Toy> toyList;
	public ToyStore()
	{
		toyList = new ArrayList<>();
	}
	public ToyStore(String ts)
	{
		loadToys(ts);
	}
	public void loadToys(String ts)
	{
		toyList = new ArrayList<>();
		String[] toys = ts.split(", ");
		
		for(int i = 0; i < toys.length; i+=2)
		{
			String name = toys[i];
			String type = toys[i + 1];
			Toy t = getThatToy(name);
			if(t == null)
			{
				if(type.equals("Car"))
				{
					toyList.add(new Car(name));
				}
				else if(type.equals("AF"))
				{
					toyList.add(new AFigure(name));
				}
			}
			else
			{
				t.setCount(t.getCount() + 1);
			}
		}
	}
	public Toy getThatToy(String nm)
	{
		for(Toy t : toyList)
		{
			if(t.getName().equals(nm))
			{
				return t;
			}
		}
		return null;
	}
	public String getMostFrequentToy()
	{
		String name = "";
		int max = 0;
		
		for(Toy t : toyList)
		{
			if(max < t.getCount())
			{
				max = t.getCount();
				name = t.getName();
			}
		}
		return name;
	}
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		
		for(Toy t: toyList)
		{
			if(t.getType().equals("Car"))
			{
				cars++;
			}
			if(t.getType().equals("AF"))
			{
				figures++;
			}
		}
		if(cars < figures)
		{
			return "Action Figures";
		}
		else if(figures < cars)
		{
			return "Cars";
		}
		else 
			return "Equal number of action figures and cars!";
	}
	public String toString()
	{
		return toyList.toString();
	}
}