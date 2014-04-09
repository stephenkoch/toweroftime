import java.util.Scanner;


public class Character {
	protected String name;
	protected String race;
	protected String role;
	protected String job;
	protected int level;
	protected int exp;
	protected int hp;
	protected int mp;
	protected int maxHp;
	protected int maxMp;
	protected int strength;
	protected int dexterity;
	protected int stamina;
	protected int intelligence;
	protected int mind;
	protected int defense;
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
		this.race = this.selectRace();
		this.spellBook = new SpellBook();
		this.gold = 5;
	}

	public String getName() { return name; }
	public String getRace() { return race; }
	public String getRole() { return role; }
	public String getJob() { return job; }
	public int getLevel() { return level; }
	public int getExp() { return exp; }
	public int getHp() { return hp; }
	public int getMp() { return mp; }
	public int getMaxHp() { return maxHp; }
	public int getMaxMp() { return maxMp; }
	public int getStrength() { return strength; }
	public int getDexterity() { return dexterity; }
	public int getStamina() { return stamina; }
	public int getIntelligence() { return intelligence; }
	public int getMind() { return mind; }
	public int getDefense() { return defense; }
	public Pack getPack() { return backpack; }
	public SpellBook getSpellBook() { return spellBook; }
	public int getGold() { return gold; }
	public int getLocationX() {return locationX;}
	public int getLocationY() {return locationY;}
	
	public void setName(String name) { this.name = name; }
	public void setRace(String race) { this.race = race; }
	public void setRole(String role) { this.role = role; }
	public void setJob(String job) { this.job = job; }
	public void setLevel(int level) { this.level = level; }
	public void setExp(int exp) { this.exp = exp; }
	public void setHp(int hp) {	this.hp = hp; }
	public void setMp(int mp) {	this.mp = mp; }
	public void setMaxHp(int MaxHp) { this.maxHp = MaxHp; }
	public void setMaxMp(int MaxMp) { this.maxMp = MaxMp; }
	public void setStrength(int strength) { this.strength = strength; }
	public void setDexterity(int dexterity) { this.dexterity = dexterity; }
	public void setStamina(int stamina) { this.stamina = stamina; }
	public void setIntelligence(int intelligence) { this.intelligence = intelligence; }
	public void setMind(int mind) { this.mind = mind; }
	public void setDefense(int defense) { this.defense = defense; }
	public void setPack(Pack backpack) { this.backpack = backpack; }	
	public void setSpellBook(SpellBook book) { this.spellBook = book; }
	public void setGold(int gold) {this.gold = gold; }
	public void setLocationX(int x) {this.locationX = x;}
	public void setLocationY(int y) {this.locationY = y;}
	
	public void shouldLevelUp() {
		if((this.exp/100) >= (this.level)) {
			this.levelUp();
		}
	}
	private void levelUp() {
		level++;
		System.out.println("+--=-=-=-=-=-LEVEL UP-=-=-=-=-=--+");
		System.out.println("+--=-=-=-=-=-LEVEL  "+level+"-=-=-=-=-=--+");
		maxHp += stamina/3;
		hp = maxHp;
		maxMp += mind/3;
		mp = maxMp;
		System.out.println("HP Increased by "+(stamina/3)+" ---> "+maxHp);
		System.out.println("MP Increased by "+(mind/3)+" ---> "+maxMp);
		strength++; System.out.println("STR Increased by 1 ---> "+strength);
		stamina++; System.out.println("STA Increased by 1 ---> "+stamina);
		dexterity++; System.out.println("DEX Increased by 1 ---> "+dexterity);
		intelligence++; System.out.println("INT Increased by 1 ---> "+intelligence);
		mind ++; System.out.println("MND Increased by 1 ---> "+mind);
		defense++; System.out.println("DEF Increased by 1 ---> "+defense);
		statDistribution();
		if(level == 10) {
    		obtainClass();
		}
	}
	private void statDistribution() {
		boolean choice = false;
		int action;
		do {
		Scanner console = new Scanner(System.in);
		Scanner exitchoice = new Scanner(System.in);
		System.out.println("You have 1 stat point to increase a stat!");
		System.out.println("1: STR  2: STA  3: DEX  4: INT  5: MND  6: DEF");
		action = console.nextInt();
		System.out.println("Are you sure?");
		System.out.println("1:Yes 2:No");
		int actionchoice = exitchoice.nextInt();
		if (actionchoice == 1) {
			choice = true;
		}
		} while (!choice);
		switch(action) {
			case 1: {
				strength++; System.out.println("You have chose to increase STR! (+1)");
				break;
			}
			case 2: {
				stamina++; System.out.println("You have chose to increase STA! (+1)");
				break;
			}
			case 3: {
				dexterity++; System.out.println("You have chose to increase DEX! (+1)");
				break;
			}
			case 4: {
				intelligence++; System.out.println("You have chose to increase INT! (+1)");
				break;
			}
			case 5: {
				mind++; System.out.println("You have chose to increase MND! (+1)");
				break;
			}
			case 6: {
				defense++; System.out.println("You have chose to increase DEF! (+1)");
				break;
			}
			default: {
				System.out.println("Incorrect input");
				statDistribution();
				break;
			}
		}
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
	

	
	public void SpellOptionSelector(Character opponent) {
		if (Game.inCombat) {
			SpellOptions(opponent);
		}
		else {
			SpellOptions();
		}
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
	
	public void obtainClass() {
		Scanner console = new Scanner(System.in);
        System.out.println("Congratulations, "+name+".  You have reached level "+level+".");
        System.out.println("You now must choose a calling...");
        System.out.println("1: Warrior  2: Mage  3: Ranger  4: Paladin  5: Barbarian");
        int action = console.nextInt();
        switch(action) {
        	case 1: { //Warrior
        		this.strength = this.strength + 4;
        		this.dexterity = this.dexterity +4;
        		this.stamina = this.stamina +5;
        		this.intelligence = this.intelligence +2;
        		this.mind = this.mind +2;
        		this.defense = this.defense+4;
        		this.job = "Warrior";
        		break;
        	}
        	case 2: { //Mage
        		this.strength = this.strength + 1;
        		this.dexterity = this.dexterity +1;
        		this.stamina = this.stamina +2;
        		this.intelligence = this.intelligence +5;
        		this.mind = this.mind +5;
        		this.defense = this.defense+1;
        		this.job = "Mage";
        		break;
        	}
        	case 3: {//Ranger
        		this.strength = this.strength + 2;
        		this.dexterity = this.dexterity +5;
        		this.stamina = this.stamina +1;
        		this.intelligence = this.intelligence +3;
        		this.mind = this.mind +4;
        		this.defense = this.defense+3;
        		this.job = "Ranger";
        		break;
        	}
        	case 4: {//Paladin
        		this.strength = this.strength + 3;
        		this.dexterity = this.dexterity +2;
        		this.stamina = this.stamina +4;
        		this.intelligence = this.intelligence +4;
        		this.mind = this.mind +3;
        		this.defense = this.defense+5;
        		this.job = "Paladin";
        		break;
        	}
        	case 5: {//Barbarian
        		this.strength = this.strength + 5;
        		this.dexterity = this.dexterity +3;
        		this.stamina = this.stamina +3;
        		this.intelligence = this.intelligence +1;
        		this.mind = this.mind +1;
        		this.defense = this.defense+2;
        		this.job = "Barbarian";
        		break;
        	}
        	default: {
        		System.out.println("Incorrect Input");
        		obtainClass();
        		break;
        	}
        }
	}
	
	protected String selectRace() {
        		this.hp = 25;
        		this.mp = 10;
        		this.maxHp = 25;
        		this.maxMp = 10;
        		this.strength = 10;
        		this.dexterity = 10;
        		this.stamina = 10;
        		this.intelligence = 10;
        		this.mind = 10;
        		this.defense = 10;
        		return "Human";
	}
}
