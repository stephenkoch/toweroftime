
public class Accessory extends Equipment{
	protected String effect;
	protected int effectStrength;
	Accessory() {
		
	}
	Accessory(String name, String id, String effect, int eS, String desc, int slot) {
		super.name = name;
		super.id = id;
		this.effect = effect;
		this.effectStrength = eS;
		super.description = desc;
		super.slot = slot;
	}
	public String getAccessoryName(){return this.name;}
	public String getAccessoryId(){return this.id;}
	public String getAccessoryDescription(){return this.description;}
	public String getAccessoryEffect(){return this.effect;}
	public int getAccessoryEffectStrength(){return this.effectStrength;}
}
