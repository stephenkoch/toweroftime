public class Armor extends Equipment{
	protected int defense;
	
	Armor() {}
	
	Armor(String name, String desc, String slot, int defense) {
		super.name = name;
		super.description = desc;
		super.slot = slot;
		this.defense = defense;
	}
	public int getArmorDefense(){return this.defense;}
}
