
public class Item {

	protected String name;
	protected String id;
	protected String description;
	
	Item() {
		
	}
	Item(String name, String id, char effect, String desc) {
		this.name = name;
		this.id = id;
		this.description = desc;

	}
	public String getName() {
		return name;
	}

	
	
}
