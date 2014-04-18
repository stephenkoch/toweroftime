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
	private int skillPoints = 0;
	
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
	public void setSkillPoints(int skillPoints){this.skillPoints = skillPoints;}
	
	public int getCurrentStrength() {return currentStrength;}
	public int getCurrentStamina() {return currentStamina;}
	public int getCurrentDexterity() {return currentDexterity;}
	public int getCurrentIntelligence() {return currentIntelligence;}
	public int getCurrentMind() {return currentMind;}
	public int getCurrentDefense() {return currentDefense;}
	public int getCurrentAgility() {return currentAgility;}
    public int getSkillPoints(){return skillPoints;}
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
	public void updateCurrentStats() 
	{
		//TODO WHEN ARMOR IS IMPLEMENTED FIX THIS TO ADD THEARMOR/WEAPON/ACCESSORY BONUS
		this.currentAgility = super.agility;
		this.currentDefense = super.defense;
		this.currentDexterity = super.dexterity;
		this.currentIntelligence = super.intelligence;
		this.currentMind = super.mind;
		this.currentStamina = super.stamina;
		this.currentStrength = super.strength;
	}
	private void levelUp() 
	{
		level++;
		TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("+--=-=-=-=-=-LEVEL UP-=-=-=-=-=--+");
		TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("+--=-=-=-=-=-LEVEL  "+level+"-=-=-=-=-=--+");
		maxHp += stamina/3;
		maxMp += mind/3;
		maxExp = (level * 100);
		exp = 0;
		hp = maxHp;
		mp = maxMp;
		TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("HP Increased by "+(stamina/3)+" ---> "+maxHp);
		TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("MP Increased by "+(mind/3)+" ---> "+maxMp);
		strength++; TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("STR Increased by 1 ---> "+strength);
		stamina++; TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("STA Increased by 1 ---> "+stamina);
		dexterity++; TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("DEX Increased by 1 ---> "+dexterity);
		intelligence++; TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("INT Increased by 1 ---> "+intelligence);
		mind ++; TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("MND Increased by 1 ---> "+mind);
		defense++; TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("DEF Increased by 1 ---> "+defense);
		agility++; TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("AGL Increased by 1 ---> "+agility);
		
		skillPoints += 2;
		TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("You have "+skillPoints +" stat point to increase a stat!");
		TowerOfTime.GAME.THEGAMEFRAME.update();
		}
	public void shouldLevelUp() {
		if((this.exp >= maxExp))
		{
			this.levelUp();
		}
	}
		
	
}
