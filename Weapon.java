
public class Weapon extends Equipment{
	protected int damage;
	protected int speed;
	Weapon() {
		
	}
	
	Weapon(String name, String desc, int slot, int damage, int speed) {
		super.name = name;
		super.description = desc;
		super.slot = slot;
		this.damage = damage;
		this.speed = speed;
	}
	public int getWeaponDamage(){return this.damage;}
	public int getWeaponSpeed(){return this.speed;}
}
