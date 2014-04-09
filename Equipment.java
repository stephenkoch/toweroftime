
public class Equipment extends Item {
	protected int slot;
	
	Equipment() {}
	
	Equipment(String name, String desc, char slot) {
		super.name = name;
		super.description = desc;
		this.slot = slot;
	}
	
	public int getSlot(){return this.slot;}
}
