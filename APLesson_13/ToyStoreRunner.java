import java.util.ArrayList;
public class ToyStoreRunner
{
	public static void main(String[]args)
	{
		String name = "2Chainz";
		ToyStore object = new ToyStore(name);
		System.out.println(object);
		
		ArrayList<ToyStore> inventory = new ArrayList<ToyStore>();
		inventory.add(new AFigure("G.I.Joe"));
		inventory.add(new AFigure("StarWars"));
		inventory.add(new Car("PullBack"));
		inventory.add(new Car("Hotwheel"));
		inventory.add(new Car("PennyRacer"));
		inventory.add(new Car("MatchBox"));
		
		System.out.println("List...");
		System.out.println(inventory);
		
		System.out.println("Most Frequent Toy: " + ToyStore.getMostFrequentToy());
		System.out.println("Most Frequent Type: " + ToyStore.getMostFrequentType());
	}
}