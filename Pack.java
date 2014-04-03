import java.util.ArrayList;
import java.util.Scanner;


public class Pack {

	protected ArrayList<UsableItem> items;
	
	Pack() {
		items = new ArrayList<UsableItem>();
	}
	
	public void showItems() {
		System.out.println("+---Inventory---+");
		for (int i = 0; i < items.size(); i++) {
		System.out.println(i+": "+items.get(i).getName());
		}
		System.out.println("+---------------+");
	}
	
	public void useItem(Player player) {
		Scanner console = new Scanner(System.in);
		System.out.println("Which item do you want to use?");
		int action = console.nextInt();
		if(items.size()-1 >= action) {
			items.get(action).useTheItem(player);
			items.remove(action);
		}
		else {
			System.out.println("Incorrect input");
		}
	}
	
	public ArrayList<UsableItem> getItems() {
		return items;
	}
	
	public void dropTheItem(Player player) {
		
	}
	
}
