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
	public void setLocationX(int x) {this.locationX = x;}
	public void setLocationY(int y) {this.locationY = y;}

}
