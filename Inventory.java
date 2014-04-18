import java.util.ArrayList;
import java.util.Scanner;


public class Inventory {

	private ArrayList<UsableItem> items;
	private ArrayList<Weapon> weapons;
	private ArrayList<Armor> armor;
	private ArrayList<Accessory> accessories;
	
	Inventory() {
		items = new ArrayList<usableItem>();
		weapons = new ArrayList<Weapon>();
		armor = new ArrayList<Armor>();
		accessories = new ArrayList<Accessory>();
	} 
	
	public void useItem() {
		
	}
	
	public ArrayList<UsableItem> getItems() {
		return items;
	}
	
	public void dropTheItem(Item item) {
		
	}
	
}
