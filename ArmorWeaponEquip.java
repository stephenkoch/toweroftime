
public class ArmorWeaponEquip {
	private Armor helmet; //Slot 0
	private Armor chest; //Slot 1
	private Armor legs; //Slot 2
	private Armor hands; //Slot 3
	private Armor feet; //Slot 4
	private Armor shield; //Slot 5
	private Weapon weapon; //Slot 6
	private Accessory amulet; //Slot 7
	private Accessory ring1; //Slot 8
	private Accessory ring2; //Slot 9
	private Accessory belt; //Slot 10
	
	private Armor noHelmet = new Armor("", "You have nothing equipped", 0, 0);
	private Armor noChest = new Armor("", "You have nothing equipped", 1, 0);
	private Armor noLegs = new Armor("", "You have nothing equipped", 2, 0);
	private Armor noHands = new Armor("", "You have nothing equipped", 3, 0);
	private Armor noFeet = new Armor("", "You have nothing equipped", 4, 0);
	private Armor noShield = new Armor("", "You have nothing equipped", 5, 0);
	private Weapon noWeapon = new Weapon("", "You have nothing equipped", 6, 0, 0);
	private Accessory noAmulet = new Accessory("", "You have nothing equipped", 7, "No effect",  0);
	private Accessory noRing1 = new Accessory("", "You have nothing equipped", 8, "No effect", 0);
	private Accessory noRing2 = new Accessory("", "You have nothing equipped", 9, "No effect", 0);
	private Accessory noBelt = new Accessory("", "You have nothing equipped", 10, "No effect", 0);
	
	ArmorWeaponEquip() {
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
