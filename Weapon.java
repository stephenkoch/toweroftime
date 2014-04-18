
public class Weapon extends Equipment{
	protected int damage;
	protected int speed;
	Weapon() {}
	
	Weapon(String name, String desc, String slot, int speed, int damage) 
	{
		super.name = name;
		super.description = desc;
		super.slot = slot;
		this.speed = speed;
		this.damage = damage;
	}
	
	public int getWeaponSpeed(){return this.speed;}
	public int getWeaponDamage(){return this.damage;}
}
