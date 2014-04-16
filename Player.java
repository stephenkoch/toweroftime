import java.util.Scanner;

public class Player extends Character
{
	private int currentFloor;
	protected ArmorWeaponEquip equipped;
	
	private int currentStrength;
	private int currentDexterity;
	private int currentStamina;
	private int currentIntelligence;
	private int currentMind;
	private int currentDefense;
	private int currentAgility;
	private int skillPoints;
	
	Player(String name)
	{
		super();
		super.setName(name);
		super.setRace(race);
		super.setRole("Player");
		super.setJob("Adventurer");
		super.setLevel(1);
		super.setExp(0);
		super.setHp(25);
		super.setMaxHp(25);
		super.setMp(25);
		super.setMaxMp(25);
		super.setStrength(10);
		super.setDexterity(10);
		super.setStamina(10);
		super.setDefense(10);
		super.setIntelligence(10);
		super.setMind(10);
		super.setAgility(10);
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
	public void setCurrentAgility(int agility) {this.currentAgility = agility;}
	
	public int getCurrentStrength() {return currentStrength;}
	public int getCurrentStamina() {return currentStamina;}
	public int getCurrentDexterity() {return currentDexterity;}
	public int getCurrentIntelligence() {return currentIntelligence;}
	public int getCurrentMind() {return currentMind;}
	public int getCurrentDefense() {return currentDefense;}
	public int getCurrentAgility() {return currentAgility;}

	public void startingStats(String job, String race) 
	{
		this.job = job;
		this.race = race;
		if (this.race == "ELF") {
			this.strength -= 1;
			this.dexterity += 1;
			this.stamina -= 1;
			this.defense -= 1;
			this.intelligence += 1;
			this.mind += 1;
		}
		if (this.race == "DWARF") {
			this.strength += 1;
			this.dexterity -= 1;
			this.stamina += 2;
			this.defense += 2;
			this.intelligence -= 2;
			this.mind -= 2;
		}
		if (this.race == "GNOME") {
			this.strength -= 2;
			this.dexterity += 2;
			this.stamina -= 2;
			this.defense -= 2;
			this.intelligence += 2;
			this.mind +=2;
		}
		if (this.race == "HALFLING") {
			this.dexterity += 1;
			this.stamina -= 1;
			this.defense -= 1;
			this.intelligence += 1;
		}
		if (this.race == "ORC") {
			this.strength += 2;
			this.dexterity += 1;
			this.stamina += 2;
			this.intelligence -= 2;
			this.mind -= 3;
		}
		if (this.job == "WARRIOR") {
			this.strength += 2;
			this.stamina += 1;
			this.defense += 1;
		}
		if (this.job == "MARKSMAN") {
			this.dexterity += 2;
			this.stamina += 1;
			this.intelligence += 1;
		}
		if (this.job == "MAGE") 
		{
			this.intelligence +=2;
			this.mind += 2;
		}
	}
	
			
		
	
}
