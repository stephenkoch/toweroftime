import javax.swing.ImageIcon;


public class Enemy extends Character{

	private ImageIcon image;

	public Enemy() {
		super();
		super.setRole("Enemy");
	}
	
	public Enemy(String name, String race, int level, int hp, int str, int dex, int sta, int inte, int def, ImageIcon image) {
		super();
		super.setName(name);
		super.setRace(race);
		super.setLevel(level);
		super.setMaxHp(hp);
		super.setHp(hp);
		super.setStrength(str);
		super.setDexterity(dex);
		super.setStamina(sta);
		super.setIntelligence(inte);
		super.setDefense(def);
		this.image = image;
	}
	public ImageIcon getImage() {return this.image;}
}
