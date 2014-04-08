
public class ArmorWeaponEquip {
	private Armor helmet;
	private Armor chest;
	private Armor legs;
	private Armor hands;
	private Armor feet;
	private Armor shield;
	private Weapon weapon;
	private Accessory amulet;
	private Accessory ring1;
	private Accessory ring2;
	private Accessory belt;
	
	ArmorWeaponEquip() {
		
	}
	
	public void setWeapon(Weapon weapon){this.weapon = weapon;}
	public String getWeaponName(){return weapon.name;}
	public String getWeaponId(){return weapon.id;}
	public String getWeaponDescription(){return weapon.description;}
	public int getWeaponDamage(){return weapon.damage;}
	public int getWeaponHands(){return weapon.hands;}
	public int getWeaponSpeed(){return weapon.speed;}
	public void unequipWeapon() {this.weapon = null;}

	public void setHelmet(Armor helmet){this.helmet = helmet;}
	public String getHelmetName(){return helmet.name;}
	public String getHelmetId(){return helmet.id;}
	public String getHelmetDescription(){return helmet.description;}
	public int getHelmetDefense(){return helmet.defense;}
	public void unequipHelmet() {this.helmet = null;}

	
	public void setChest(Armor chest){this.chest = chest;}
	public String getChestName(){return chest.name;}
	public String getChestId(){return chest.id;}
	public String getChestDescription(){return chest.description;}
	public int getChestDefense(){return chest.defense;}
	public void unequipChest() {this.chest = null;}

	
	public void setLegs(Armor legs){this.legs = legs;}
	public String getLegsName(){return legs.name;}
	public String getLegsId(){return legs.id;}
	public String getLegsDescription(){return legs.description;}
	public int getLegsDefense(){return legs.defense;}
	public void unequipLegs() {this.legs = null;}

	
	public void setHands(Armor hands){this.hands = hands;}
	public String getHandsName(){return hands.name;}
	public String getHandsId(){return hands.id;}
	public String getHandsDescription(){return hands.description;}
	public int getHandsDefense(){return hands.defense;}
	public void unequipHands() {this.hands = null;}

	
	public void setFeet(Armor feet){this.feet = feet;}
	public String getFeetName(){return feet.name;}
	public String getFeetId(){return feet.id;}
	public String getFeetDescription(){return feet.description;}
	public int getFeetDefense(){return feet.defense;}
	public void unequipFeet() {this.feet = null;}
	
	public void setShield(Armor shield){this.shield = shield;}
	public String getShieldName(){return shield.name;}
	public String getShieldId(){return shield.id;}
	public String getShieldDescription(){return shield.description;}
	public int getShieldDefense(){return shield.defense;}
	public void unequipShield() {this.shield = null;}
	
	public void setAmulet(Accessory amulet){this.amulet = amulet;}
	public String getAmuletName(){return amulet.name;}
	public String getAmuletId(){return amulet.id;}
	public String getAmuletDescription(){return amulet.description;}
	public String getAmuletEffect(){return amulet.effect;}
	public int getAmuletEffectStrength(){return amulet.effectStrength;}
	public void unequipAmulet() {this.amulet = null;}

	public void setRing1(Accessory ring1){this.ring1 = ring1;}
	public String getRing1Name(){return ring1.name;}
	public String getRing1Id(){return ring1.id;}
	public String getRing1Description(){return ring1.description;}
	public String getRing1Effect(){return ring1.effect;}
	public int getRing1EffectStrength(){return ring1.effectStrength;}
	public void unequipRing1() {this.ring1 = null;}
	
	public void setRing2(Accessory ring2){this.ring2 = ring2;}
	public String getRing2Name(){return ring2.name;}
	public String getRing2Id(){return ring2.id;}
	public String getRing2Description(){return ring2.description;}
	public String getRing2Effect(){return ring2.effect;}
	public int getRing2EffectStrength(){return ring2.effectStrength;}
	public void unequipRing2() {this.ring2 = null;}

	public void setBelt(Accessory belt){this.belt = belt;}
	public String getBeltName(){return belt.name;}
	public String getBeltId(){return belt.id;}
	public String getBeltDescription(){return belt.description;}
	public String getBeltEffect(){return belt.effect;}
	public int getBeltEffectStrength(){return belt.effectStrength;}	
	public void unequipBelt() {this.belt = null;}
}
