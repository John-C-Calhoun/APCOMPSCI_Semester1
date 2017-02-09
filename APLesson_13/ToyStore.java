import java.util.ArrayList;
public class ToyStore
{
	private ArrayList<toyList> toyList;
	static int count = 0;
	
	public ToyStore()
	{
		loadToys();
	}
	public ToyStore(String ts)
	{
		loadToys(ts);
	}
	public static void loadToys(String ts)
	{
		ArrayList<String> toys = new ArrayList<>(Arrays.asList(ts.split(", ")));
		
		for(int i = 0; i < toys.size; i++)
		{
			String name = toys.get(i);
			String type = toys.get(i) + 1;
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
	public String getThatToy(String nm)
	{
		for(Toy t : toyList)
		{
			if(t.getName().equals(nm))
			{
				return t;
			}
			else
			{
				return null;
			}
		}
	}
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		
		if(max < count)
		{
			max = count;
			name = name;
		}
		return name;
	}
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		
		for(String Toy: toyList)
		{
			if(t.getType == "Car")
			{
				cars++;
			}
			if(t.getType == "AF")
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
		else if(figures == cars)
		{
			return "Equal number of action figures and cars!";
		}
	}
	public String toString()
	{
		return toyList;
	}
}