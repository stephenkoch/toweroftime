
public class Item {

	protected String name;
	protected String description;
	
	Item() {
		
	}
	Item(String name, char effect, String desc) {
		this.name = name;
		this.description = desc;
	}
	
	public String getName() {return name;}
	public String getDescription(){return this.description;}


	
	
}
