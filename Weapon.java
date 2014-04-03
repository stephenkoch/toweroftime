
public class Weapon extends Equipment{
	protected int hands;
	protected int damage;
	protected int speed;
	Weapon() {
		
	}
	
	Weapon(String name, String id, String desc, int slot, int hands, int damage, int speed) {
		super.name = name;
		super.id = id;

		super.description = desc;
		super.slot = slot;
		this.damage = damage;
		this.speed = speed;
	}
	public String getWeaponName(){return this.name;}
	public String getWeaponId(){return this.id;}
	public String getWeaponDescription(){return this.description;}
	public int getWeaponDamage(){return this.damage;}
	public int getWeaponHands(){return this.hands;}
	public int getWeaponSpeed(){return this.speed;}
}
