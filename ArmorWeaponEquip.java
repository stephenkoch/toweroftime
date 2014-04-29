public class ArmorWeaponEquip 
{
	private Armor helmet; //Slot Helmet
	private Armor chest; //Slot Chest
	private Armor legs; //Slot Legs
	private Armor hands; //Slot Hands
	private Armor feet; //Slot Feet
	private Armor shield; //Slot Shield
	private Weapon weapon; //Slot Weapon
	private Accessory amulet; //Slot Amulet
	private Accessory ring1; //Slot Ring1
	private Accessory ring2; //Slot Ring2
	private Accessory belt; //Slot Belt
	
	private Armor noHelmet = new Armor("No Helmet Equipped", "You are headless!","Helmet", 0);
	private Armor noChest = new Armor("No Cuirass Equipped", "You have nothing equipped","Chest", 0);
	private Armor noLegs = new Armor("No Greaves Equipped", "You are not wearing any pants.", "Legs", 0);
	private Armor noHands = new Armor("No Gloves Equipped", "You are bare handed", "Hands", 0);
	private Armor noFeet = new Armor("No Boots Equipped", "You have nothing equipped", "Feet", 0);
	private Armor noShield = new Armor("No Shield Equipped", "You have nothing equipped","Shield", 0);
	
	private Weapon noWeapon = new Weapon("No Weapon Equipped", "Fight with your fists!","Weapon", 4, 2);
	private Accessory noAmulet = new Accessory("No Amulet Equipped", "No Bling!", "Amulet", "No effect",  0);
	private Accessory noRing1 = new Accessory("No Ring Equipped", "Single and loving it?", "Ring1", "No effect", 0);
	private Accessory noRing2 = new Accessory("No Ring Equipped", "You have nothing equipped", "Ring2", "No effect", 0);
	private Accessory noBelt = new Accessory("No Belt Equipped", "You have nothing equipped", "Belt", "No effect", 0);
	
	ArmorWeaponEquip()
	{
		helmet = noHelmet;
		chest = noChest;
		legs = noLegs;
		hands = noHands;
		feet = noFeet;
		shield = noShield;
		weapon = noWeapon;
		amulet = noAmulet;
		ring1 = noRing1;
		ring2 = noRing2;
		belt = noBelt;
	}
	//Weapon
	public void setWeapon(Weapon weapon) {this.weapon = weapon;}
	public Weapon getWeapon() {return weapon;}
	public void unequipWeapon() {this.weapon = noWeapon;}

	//Helmet
	public void setHelmet(Armor helmet) {this.helmet = helmet;}
	public Armor getHelmet() {return helmet;}
	public void unequipHelmet() {this.helmet = noHelmet;}
	
	//Chest
	public void setChest(Armor chest){this.chest = chest;}
	public Armor getChest() {return chest;}
	public void unequipChest() {this.chest = noChest;}

	//Legs
	public void setLegs(Armor legs){this.legs = legs;}
	public Armor getLegs() {return legs;}
	public void unequipLegs() {this.legs = noLegs;}

	//Hands
	public void setHands(Armor hands){this.hands = hands;}
	public Armor getHands() {return hands;}
	public void unequipHands() {this.hands = noHands;}

	//Feet
	public void setFeet(Armor feet){this.feet = feet;}
	public Armor getFeet() {return feet;}
	public void unequipFeet() {this.feet = noFeet;}
	
	//Shield
	public void setShield(Armor shield){this.shield = shield;}
	public Armor getShield() {return shield;}
	public void unequipShield() {this.shield = noShield;}
	
	//Amulet
	public void setAmulet(Accessory amulet){this.amulet = amulet;}
	public Accessory getAmulet() {return amulet;}
	public void unequipAmulet() {this.amulet = noAmulet;}

	//Ring1
	public void setRing1(Accessory ring1){this.ring1 = ring1;}
	public Accessory getRing1() {return ring1;}
	public void unequipRing1() {this.ring1 = noRing1;}
	
	//Ring2
	public void setRing2(Accessory ring2){this.ring2 = ring2;}
	public Accessory getRing2() {return ring2;}
	public void unequipRing2() {this.ring2 = noRing2;}

	//Belt
	public void setBelt(Accessory belt){this.belt = belt;}
	public Accessory getBelt() {return belt;}
	public void unequipBelt() {this.belt = noBelt;}
}
