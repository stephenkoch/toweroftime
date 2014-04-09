import java.util.Scanner;

public class Player extends Character{
	private int currentFloor;
	protected ArmorWeaponEquip equipped;
	
	private int currentStrength;
	private int currentDexterity;
	private int currentStamina;
	private int currentIntelligence;
	private int currentMind;
	private int currentDefense;
	
	Player(String name) {
		super();
		super.setName(name);
		super.setRace(race);
		super.setRole("Player");
		super.setJob("Adventurer");
		super.setLevel(1);
		super.setExp(0);
		super.setHp(25);
		super.setMaxHp(25);
		super.setStrength(11);
		super.setDexterity(11);
		super.setStamina(11);
		super.setIntelligence(11);
		super.setMind(11);
		super.setDefense(11);
		super.backpack = new Pack();
		equipped = new ArmorWeaponEquip();
		
	}
	
	public int getCurrentFloor() {return currentFloor;}
	public void setCurrentFloor(int floor) {this.currentFloor = floor;}
	
	public void setCurrentStrength(int strength) {this.currentStrength = strength;}
	public void setCurrentStamina(int stamina) {this.currentStamina = stamina;}
	public void setCurrentDexterity(int dexterity) {this.currentDexterity = dexterity;}
	public void setCurrentIntelligence(int intelligence) {this.currentIntelligence = intelligence;}
	public void setCurrentMind(int mind) {this.currentMind = mind;}
	public void setCurrentDefense(int defense) {this.currentDefense = defense;}
	
	public int getCurrentStrength() {return currentStrength;}
	public int getCurrentStamina() {return currentStamina;}
	public int getCurrentDexterity() {return currentDexterity;}
	public int getCurrentIntelligence() {return currentIntelligence;}
	public int getCurrentMind() {return currentMind;}
	public int getCurrentDefense() {return currentDefense;}
	
			
		
	
}
