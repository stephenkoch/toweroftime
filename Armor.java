
public class Armor extends Equipment{
	protected int defense;
	
	Armor() {}
	
	Armor(String name, String id, String desc, int slot) {
		super.name = name;
		super.id = id;
		super.description = desc;
		super.slot = slot;
	}
	public String getArmorName(){return this.name;}
	public String getArmorId(){return this.id;}
	public String getArmorDescription(){return this.description;}
	public int getArmorDefense(){return this.defense;}
}
