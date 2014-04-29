import java.util.ArrayList;
import java.util.Scanner;


public class Inventory {

	private ArrayList<UsableItem> items;
	private ArrayList<Weapon> weapons;
	private ArrayList<Armor> armor;
	private ArrayList<Accessory> accessories;
	
	Inventory() {
		items = new ArrayList<UsableItem>();
		weapons = new ArrayList<Weapon>();
		armor = new ArrayList<Armor>();
		accessories = new ArrayList<Accessory>();
	} 
	public void addEquipment(Equipment item) {
		if (item.getSlot().equalsIgnoreCase("Weapon")) {
			weapons.add((Weapon) item);
		}
	}
	
	public void useItem() {
		
	}
	
	public ArrayList<Weapon> getWeapons(){
		return weapons;
	}
	
	public ArrayList<UsableItem> getItems() {
		return items;
	}
	
	public void dropTheItem(Item item) {
		
	}
	
}
