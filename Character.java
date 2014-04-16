import java.util.Scanner;

import javax.swing.JTextField;


public class Character 
{
	protected String name;
	protected String race;
	protected String role;
	protected String job;
	protected String gender;
	protected int level;
	protected int exp;
	protected int hp;
	protected int mp;
	protected int maxHp;
	protected int maxMp;
	protected int maxExp = 100;
	protected int strength;
	protected int dexterity;
	protected int stamina;
	protected int intelligence;
	protected int mind;
	protected int defense;
	protected int agility;
	protected Pack backpack;
	protected SpellBook spellBook;
	protected int gold;
	protected int locationX;
	protected int locationY;
	protected int skillPoints;
	protected Equipment equipment;
	Character() {

	}
	
	Character(String name) {
		this.name = name;
		this.job = "Adventurer";
		this.role = "Player";
		this.level = 1;
		this.exp = 0;
		this.backpack = new Pack();
		this.spellBook = new SpellBook();
		this.gold = 5;
		this.skillPoints = 0;
	}

	public String getName() { return name; }
	public String getRace() { return race; }
	public String getRole() { return role; }
	public String getJob() { return job; }
	public String getGender() { return gender; }
	public int getLevel() { return level; }
	public int getExp() { return exp; }
	public int getHp() { return hp; }
	public int getMp() { return mp; }
	public int getMaxHp() { return maxHp; }
	public int getMaxMp() { return maxMp; }
	public int getMaxExp() { return maxExp; }
	public int getStrength() { return strength; }
	public int getDexterity() { return dexterity; }
	public int getStamina() { return stamina; }
	public int getIntelligence() { return intelligence; }
	public int getMind() { return mind; }
	public int getDefense() { return defense; }
	public int getAgility() { return agility; }
	public Pack getPack() { return backpack; }
	public SpellBook getSpellBook() { return spellBook; }
	public int getGold() { return gold; }
	public int getSkillPoints() {return skillPoints;}
	public int getLocationX() {return locationX;}
	public int getLocationY() {return locationY;}
	
	public void setName(String name) { this.name = name; }
	public void setRace(String race) { this.race = race; }
	public void setRole(String role) { this.role = role; }
	public void setJob(String job) { this.job = job; }
	public void setGender(String gender) {this.gender = gender; }
	public void setLevel(int level) { this.level = level; }
	public void setExp(int exp) { this.exp = exp; }
	public void setHp(int hp) {	this.hp = hp; }
	public void setMp(int mp) {	this.mp = mp; }
	public void setMaxHp(int MaxHp) { this.maxHp = MaxHp; }
	public void setMaxMp(int MaxMp) { this.maxMp = MaxMp; }
	public void setMaxExp(int MaxExp) {this.maxExp = MaxExp;}
	public void setStrength(int strength) { this.strength = strength; }
	public void setDexterity(int dexterity) { this.dexterity = dexterity; }
	public void setStamina(int stamina) { this.stamina = stamina; }
	public void setIntelligence(int intelligence) { this.intelligence = intelligence; }
	public void setMind(int mind) { this.mind = mind; }
	public void setDefense(int defense) { this.defense = defense; }
	public void setAgility(int agility) { this.agility = agility; }
	public void setPack(Pack backpack) { this.backpack = backpack; }	
	public void setSpellBook(SpellBook book) { this.spellBook = book; }
	public void setGold(int gold) {this.gold = gold; }
	public void setSkillPoints(int skillPoints) {this.skillPoints = skillPoints;}
	public void setLocationX(int x) {this.locationX = x;}
	public void setLocationY(int y) {this.locationY = y;}
	
	public void shouldLevelUp() {
		if((this.exp >= maxExp))
		{
			this.levelUp();
		}
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
		strength++;TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("STR Increased by 1 ---> "+strength);
		stamina++; TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("STA Increased by 1 ---> "+stamina);
		dexterity++;TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("DEX Increased by 1 ---> "+dexterity);
		intelligence++;TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("INT Increased by 1 ---> "+intelligence);
		mind ++;TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("MND Increased by 1 ---> "+mind);
		defense++;TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("DEF Increased by 1 ---> "+defense);
		agility++;TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("AGL Increased by 1 ---> "+agility);
		statDistribution();
		}
	private void statDistribution() 
	{
		
		System.out.println("You have 1 stat point to increase a stat!");
		System.out.println("1: STR  2: STA  3: DEX  4: INT  5: MND  6: DEF");
		TowerOfTime.GAME.THEGAMEFRAME.PANELE.updateActionLog("You have 1 stat point to increase a stat!");
			skillPoints += 2;
	}
	

	public void startingSpells() {
	}
	public void showStatus() {
		System.out.println("-----------------------------------");
		System.out.println("NAME: "+name+ "   "+"RACE: "+race);
		System.out.println("CLASS: " + job+" LEVEL: "+level+" ("+exp+")");
		System.out.println("HP: "+hp+"/"+maxHp+" MP: "+mp+"/"+maxMp);
		System.out.println("STR: "+strength+"  DEX: "+dexterity);
		System.out.println("STM: "+stamina+"  INT: "+intelligence);
		System.out.println("DEF: "+defense+"  MND: "+mind);
		System.out.println("-----------------------------------");
	}
	
	public void SpellOptions() { //Out of combat
		Scanner console = new Scanner(System.in);
		this.getSpellBook().showSpells();
		System.out.println("1: Cast Spell 2: Exit");
		int action = console.nextInt();
		switch(action) {
			case 1: {
				this.getSpellBook().CastSpell(this);
				break;
			}
			case 2: {
				break;
			}
			default: {
				System.out.println("Incorrect Input");
				SpellOptions();
				break;
			}
		}
	}
	public void SpellOptions(Character opponent) { //In Combat
		Scanner console = new Scanner(System.in);
		this.getSpellBook().showSpells();
		System.out.println("1: Cast Spell 2: Exit");
		int action = console.nextInt();
		switch(action) {
			case 1: {
				this.getSpellBook().CastSpell(this, opponent);
				break;
			}
			case 2: {
				break;
			}
			default: {
				System.out.println("Incorrect Input");
				SpellOptions();
				break;
			}
		}
	}
}
