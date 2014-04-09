
public class Accessory extends Equipment{
	protected String effect;
	protected int effectStrength;
	Accessory() {
		
	}
	
	Accessory(String name, String desc, int slot, String effect, int eS) {
		super.name = name;
		this.effect = effect;
		this.effectStrength = eS;
		super.description = desc;
		super.slot = slot;

	}
	
	public String getAccessoryEffect(){return this.effect;}
	public int getAccessoryEffectStrength(){return this.effectStrength;}
}
