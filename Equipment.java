public class Equipment extends Item 
{
	protected String slot;
	
	Equipment() {}
	
	Equipment(String name, String desc, String slot) {
		super.name = name;
		super.description = desc;
		this.slot = slot;
	}
	
	public String getSlot(){return this.slot;}
}
