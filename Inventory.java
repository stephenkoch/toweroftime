import java.util.ArrayList;
import java.util.Scanner;


public class Inventory {

	private ArrayList<UsableItem> potions;
	private ArrayList<Weapon> weapons;
	
	private ArrayList<Armor> helmets;
	private ArrayList<Armor> chests;
	private ArrayList<Armor> legs;
	private ArrayList<Armor> feet;
	private ArrayList<Armor> hands;
	private ArrayList<Armor> shields;
	
	private ArrayList<Accessory> rings;
	private ArrayList<Accessory> belts;
	
	Inventory() {
		potions = new ArrayList<UsableItem>();
		weapons = new ArrayList<Weapon>();
		helmets = new ArrayList<Armor>();
		chests = new ArrayList<Armor>();
		legs = new ArrayList<Armor>();
		feet = new ArrayList<Armor>();
		hands = new ArrayList<Armor>();
		shields = new ArrayList<Armor>();
		rings = new ArrayList<Accessory>();
		belts = new ArrayList<Accessory>();
	} 
	public void addEquipment(Equipment item) 
	{
		if (item.getSlot().equalsIgnoreCase("Weapon")) {
			weapons.add((Weapon) item);
		}
		
		//--------------------------------------------------
		if (item.getSlot().equalsIgnoreCase("Helmet")) {
			helmets.add((Armor) item);
		}
		if (item.getSlot().equalsIgnoreCase("Chest")) {
			chests.add((Armor) item);
		}
		if (item.getSlot().equalsIgnoreCase("Legs")) {
			legs.add((Armor) item);
		}
		if (item.getSlot().equalsIgnoreCase("Feet")) {
			feet.add((Armor) item);
		}
		if (item.getSlot().equalsIgnoreCase("Hands")) {
			hands.add((Armor) item);
		}
		
		if (item.getSlot().equalsIgnoreCase("Shield")) {
			shields.add((Armor) item);
		}	
		
		//---------------------------------------------------
		if (item.getSlot().equalsIgnoreCase("Ring")) {
			rings.add((Accessory) item);
		}
		
		if (item.getSlot().equalsIgnoreCase("Belt")) {
			belts.add((Accessory) item);
		}
		//----------------------------------------------------
	}
	
	public void addUsableItem(Item item)
	{
		potions.add((UsableItem) item);
	}
	
	public void useItem() {
		
	}
	
	public ArrayList<Weapon> getWeapons()
	{
		return weapons;
	}
	
	public ArrayList<Armor> getHelmets(){
		return helmets;
	}
	
	public ArrayList<Armor> getChests(){
		return chests;
	}
	
	public ArrayList<Armor> getLegs(){
		return legs;
	}
	
	public ArrayList<Armor> getFeet(){
		return feet;
	}
	
	public ArrayList<Armor> getHands()
	{
		return hands;
	}
	
	public ArrayList<Armor> getShields(){
		return shields;
	}
	
	public ArrayList<UsableItem> getPotions(){
		return potions;
		
	}
	
	public ArrayList<Accessory> getRings(){
		return rings;
	}
	public ArrayList<Accessory> getBelts(){
		return belts;
	}
	
	
	public void dropTheItem(Item item) {
		
	}
	
}
