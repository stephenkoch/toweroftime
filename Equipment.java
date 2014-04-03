
public class Equipment extends Item {
	protected int slot;
	
	Equipment() {}
	
	Equipment(String name, String id, String desc, char slot) {
		super.name = name;
		super.id = id;
		super.description = desc;
		this.slot = slot;
	}
}
